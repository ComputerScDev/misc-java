import java.io.*;

public class LuckySevens {
	
	public static final int _WINVALUE_ = 4;
	public static final int _LOSEVALUE_ = -1;
	
	public static void main(String[] args) {
		int startingCash = getStartingCash();
		System.out.println();
		play(startingCash);
	}
	
	// get a +ve integer as starting cash
	public static int getStartingCash() {
		int x = 0;
		boolean valid;
		String input = null;
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			valid = true;
			System.out.print("Enter starting amount of cash (or \"quit\" to quit): ");
			try {
				input = cin.readLine();
				if (input.equals("quit")) {
					System.out.println("\nQuitting...\n");
					System.exit(1);
				}
				x = Integer.parseInt(input);
				if (x <= 0) {
					valid = false;
				}
			}
			catch (IOException e) {
				valid = false;
			}
			catch (NumberFormatException e) {
				valid = false;
			}
			if (!valid) {
				System.out.println("\nERROR: Starting amount must be a +ve integer.\n");
			}
		} while (!valid);
		return x;
	} // end getStartingCash
	
	// play Lucky Sevens with a starting amount of money
	public static void play(int startingCash) {
		int cash = startingCash;	// current amount
		int maxCash = cash;		// peak winnings
		int nRolls = 0;				// number of rolls before bankrupt
		
		int[] rollFreq = new int[13];	// freq of roll values
		for (int i = 0; i < rollFreq.length; i++) {
			rollFreq[i] = 0;
		}
		
		// the actual game
		while (cash > 0) {
			int rollValue = rollDice();
			rollFreq[rollValue]++;
			
			cash += (rollValue == 7) ? _WINVALUE_ : _LOSEVALUE_;
			String outcome = (rollValue == 7) ? "WIN" : "LOSE";
			
			if (cash > maxCash) {
				maxCash = cash;
			}
			
			nRolls++;
			System.out.format("\tRoll %3d : %2d %4s -> $%d\n", nRolls, rollValue, outcome, cash);
		}
		System.out.println();
		summarize(startingCash, maxCash, nRolls);
		checkFairness(rollFreq, nRolls);
	} // end play
	
	// Helper function #1 : get dice-roll outcome
	public static int rollDice() {
		return randUnif(1,6) + randUnif(1,6);
	} // end rollDice
	
	// HF#1.1 : get random integer in [LB, UB]
	public static int randUnif(int LB, int UB) {
		return (int)((UB - LB + 1)*Math.random()) + LB;
	} // end randUnif
	
	// Helper function #2 : summarize outcome
	public static void summarize(int startingCash, int maxCash, int nRolls) {
		System.out.println("You started with $" + startingCash +".\n"
							+ "You peak at $" + maxCash + ".\n"
							+ "After " + nRolls + " rolls, you go bankrupt. \n");
	} // end summarize
	
	// Helper function #3 : check fairness of dice-roll distribution
	public static void checkFairness(int[] rollDist, int nRolls) {
		System.out.println("Was it fair? Roll distribution:\n");
		printHistogram(rollDist);
		
		boolean fair = chiSquared(rollDist, nRolls); 
		if (fair) {
			System.out.println("\nFair at 95% significance level.\n");
		} else {
			System.out.println("\nUnfair at 95% significance level.\n");
		}
	} // end checkFairness
	
	// HF#3.1: print histogram
	public static void printHistogram(int[] freq) {
		int maxHeight = 10;
		double maxVal = (double)max(freq);
		double step = (maxVal > maxHeight) ? maxVal/maxHeight : 1;
		
		// print vertical bars
		for (double cur = maxVal; cur > 0; cur -= step) {
			for (int i = 0; i < freq.length; i++) {
				String marker = (freq[i] >= cur) ? "X" : "";
				System.out.format("%3s", marker);
			}
			System.out.println();
		}
		
		// print axis
		for (int i = 0; i < 13; i++) {
			System.out.print("---");
		}
		System.out.println();
		
		// print x-tick marks
		for (int i = 0; i < 13; i++) {
			System.out.format("%3d", i);
		}
		System.out.println();
	} // end printHistogram
	
	// HF3.2 : get max value in array
	public static int max(int[] x) {
		int maxVal = x[0];
		for (int val : x) {
			if (val > maxVal) {
				maxVal = val;
			}
		}
		return maxVal;
	}
	
	// HF#3.3 : Chi-Squared test for two uniform distributions, True if fair, False otherwise
	public static boolean chiSquared(int[] sampleFreq, int nSamples) {
		double [] expDist = {0, 0, 1/36., 2/36., 3/36., 4/36., 5/36., 6/36., 5/36., 4/36., 3/36., 2/36., 1/36.};
		
		// degrees of freedom is 11 (bins) - 4 (triangle dist df + 1) = 7
		// sig level = 95%, p = 0.05
		double critVal = 14.067;
		
		// turn sample counts into percentage frequencies
		int[] expFreq = new int[13];
		for (int i = 2; i <= 12; i++) {
			expFreq[i] = (int)Math.round(expDist[i]*nSamples);
		}
		
		// Chi-squared statistic
		double testStat = 0.;
		for (int i = 2; i <= 12; i++) {
			testStat += Math.pow(sampleFreq[i]-expFreq[i], 2)/expFreq[i];
		}
		// reject H0 if testStat > critVal
		return (testStat <= critVal);
	} // end chiSquared
	
} // end LuckySevens