/* Write a program called GradesAverage, which prompts user for the number of students, 
reads it from the keyboard, and saves it in an int variable called numStudents. 
It then prompts user for the grades of each of the students and saves them in an 
int array called grades. Your program shall check that the grade is between 0 and 100. */ 

import java.util.Scanner;

class e1gradesaverage {
	
	public int computeAverage(int[] grades, int numStudents) {
		int sum = 0;
		for (int grade : grades) { // for each int grade in int[] grades
			sum+=grade;
		} return sum/numStudents;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = in.nextInt();
		if (numStudents == 0) {
			System.out.println("Invalid, try again...");
			numStudents = in.nextInt();
		}
		int[] grades = new int[numStudents];
		for (int i = 0; i<=numStudents-1;i++) {
			System.out.print("Enter the grade for student "+(i+1)+": ");
			int grade = in.nextInt();
			if ((grade>100)||(grade<0)) {
				System.out.println("Invalid grade, try again...");
				grade = in.nextInt();
			} else {
				grades[i]=grade;
			}
		}
		e1gradesaverage im = new e1gradesaverage();
		System.out.println("The average is "+im.computeAverage(grades,numStudents));
	}
	
}