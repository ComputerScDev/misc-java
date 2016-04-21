/**
* Write a program called SumAndAverage to produce the sum 
* of 1, 2, 3, ..., to an upperbound (e.g., 100). 
* Also compute and display the average.
*/
public class e1sumandaverage {
	
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		int number = lowerbound;
		while (number <= upperbound) {
			sum+=number;
			++number;
		}
		
		average = (double)sum/upperbound; // converts int to double.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
}

/**
* special sums:
*/

/**
* sum of squares from 1 to 100.
*/
/*  public class s1p2e1_sumandaverage {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		int number = lowerbound;
		int interm = 0;
		while (number <= upperbound) {
			interm = number*number;
			sum+=interm;
			++number;
		}
		average = (double)sum/upperbound; // converts int to double.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
 } */
 
/**
* sum only the numbers divisible by 7, from 1 to 100.
*/
/* public class s1p2e1_sumandaverage {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number<=upperbound; ++number) {
			if (number%7 == 0) {
				sum+= number;
			}
		}
		average = (double)sum/upperbound; // converts int to double.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
} */

/**
* sum only odd numbers from 1 to 100.
*/
/* public class s1p2e1_sumandaverage {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number<=upperbound; ++number) {
			if (number%2 != 0) {
				sum+= number;
			}
		}
		average = (double)sum/upperbound; // converts int to double.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
} */


/**
* sums from 11 to 8899 and computes the sum and average.
*/
/* public class s1p2e1_sumandaverage {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 111;
		int upperbound = 8899;
		int count = 0;
		for (int number = lowerbound; number<=upperbound; ++number) {
			sum+= number;
			++count;
		}
		average = (double)sum/upperbound; // converts int to double.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Count: " + count);
	}
} */


/**
* finding the sum from 1 to 100 using a do-while loop.
*/
/* 	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		int number = lowerbound;
		do {
			sum+= number;
			++number;
		} while (number <= upperbound);
		average = (double)sum/upperbound; // converts int to double.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	} */

/**
* finding the sum from 1 to 100 using a while-do loop.
*/
/* 	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		int number = lowerbound;
		while (number <= upperbound) {
			sum+=number;
			++number;
		}
		average = (double)sum/upperbound; // converts int to double.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	} */

/**
* original
*/
/* 	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number<=upperbound; ++number) {
			sum+= number;
		}
		average = (double)sum/upperbound; // converts int to double.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	} */
	
/**
* difference between while-do and do-while:
* in while-do; the condition is tested first - the body will be executed if the condition is true and the process repeats.
* in do-while; the body is executed first and then the condition is tested.
* NOTE: the body of the do-while loop will be executed at least once, while in the while-do its possibly zero.
* similarly, the for-loop's body might not be executed. 
*/