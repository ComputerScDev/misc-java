/* Write a program called GradesStatistics, which reads in n grades 
(of int between 0 and 100, inclusive) and displays the average, minimum, maximum, 
and standard deviation. Your program shall check for valid input. You should keep 
the grades in an int[] and use a method for each of the computations.  */

import java.util.Scanner;

class e1gradestatistics {
	
	public static int[] grades; // static field
	
	// static methods below, to access the static field above.
	
	public static double average() {
		if (grades.length == 0) {
			return 0.0;
		} else {
			double sum = 0.0;
			for (int i=0;i<=grades.length-1;i++) {
				sum+=grades[i];
			} return sum/grades.length;
		}
	}
	
	public static int max() {
		if (grades.length == 0) {
			return 0;
		} else {
			int max = grades[0];
			for (int i=0;i<=grades.length-1;i++) {
				max = (max<grades[i]) ? grades[i] : max;
				// if (max<grades[i]), then let max=grades[i],
				// else, no change.
			} return max;
		}
	}
	
	public static int min() {
		if (grades.length == 0) {
			return 0;
		} else {
			int min = grades[0];
			for (int i=0;i<=grades.length-1;i++) {
				min = (min>grades[i]) ? grades[i] : min;
			} return min;
		}
	}
	
	public static double stdDev() {
		if (grades.length == 0) {
			return 0f;
		} else {
			double mean = average();
			double diffMeanSampleMean = 0;
			for (int i=0;i<=grades.length-1;i++) {
				diffMeanSampleMean+=(grades[i]*grades[i]-(mean*mean));
			} return Math.sqrt(diffMeanSampleMean/grades.length);
		}
	}
	
	public static void readGrades() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberStudents = in.nextInt();
		grades = new int[numberStudents];
		for (int i=0;i<=numberStudents-1;i++) {
			System.out.print("Enter the grade for student "+(i+1)+": ");
			int grade = in.nextInt();
			if ((grade>=100)||(grade<=0)) {
				System.out.print("Invalid entry. Retry: ");
				grade = in.nextInt();
			} else {
				grades[i]=grade;
			}
		}
	}
	
	public static void main(String[] args) {
		readGrades();
		System.out.println("The average is " + average());
		System.out.println("The minimum is " + min());
		System.out.println("The maximum is " + max());
		System.out.println("The standard deviation is " + stdDev());
	}
	
}
