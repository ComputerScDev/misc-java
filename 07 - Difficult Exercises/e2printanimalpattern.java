/* Write a program called PrintAnimalPattern, 
which uses println() or printf() to produce this pattern:

          '__'
          (©©)
  /========\/
 / || %% ||
*  ||----||
   ¥¥    ¥¥
   ""    "" */

class e2printanimalpattern {
	
	public static void printAnimal() {
		System.out.printf("          '__'\n");
        System.out.printf("          (\u00A9\u00A9)\n");
        System.out.printf("  /========\\/\n");
        System.out.printf(" / || %%%% ||\n");
        System.out.printf("*  ||----||\n");
        System.out.printf("   \u00A5\u00A5    \u00A5\u00A5\n");
        System.out.printf("   \"\"    \"\"\n");
        System.out.println();
	}
	
	public static void main(String[] args) {
		printAnimal();
	}
	
}