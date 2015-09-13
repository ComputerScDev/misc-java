/* Write a program called GradesHistogram, which reads in n grades 
(of int between 0 and 100, inclusive) from a text file called "grades.in" 
and displays the histogram horizontally and vertically. The file has the following format:
numStduents:int
grade1:int grade2:int .... gradeN:int */

import java.io.*;
import java.util.Scanner;

class e2gradeshistogram {
	
	public static int[] grades;
	// Declare an int array of grades, to be allocated later.
	public static int[] bins = new int[10];
	// Declare and allocate an int array for histogram bins.
	// 10 bins for 0-9, 10-19, ..., 90-100.
	
	public static void main(String[] args) throws FileNotFoundException {
		readGrades("grades.in.txt");
		computeHistogram();
		printHistogramHorizontal();
		printHistogramVertical();
	}
	
	// Read grades from 'filename', stored in 'grades' array.
	// Assume that the inputs are valid.
	public static void readGrades(String filename) throws FileNotFoundException {
		String filepath = e2gradeshistogram.class.getResource(filename).getPath();
		Scanner file = new Scanner(new File(filename));
		
		if (!file.hasNextInt()) {
			System.out.println("Error. Student # Not Found.");
			return;
		} else {
			int n = file.nextInt();
			grades = new int[n];
			
			for (int i=0;i<n;i++) {
				if (!file.hasNextInt()) {
					continue;
				} else {
					grades[i]=file.nextInt();
				}
			}
		}
	}
	
	public static void computeHistogram() {
		for (int i=0;i<grades.length;i++) {
			int j=(grades[i]==100) ? 9 : grades[i]/10;
			bins[j]+=1;
		}
	}
	
	public static void printHistogramHorizontal() {
		System.out.println();
		for (int i=0; i<bins.length; i++) {
			int delta = (i==bins.length-1) ? 10 : 9;
			System.out.printf("%2d -%3d: ", (i*10), ((i*10)+delta));
			for (int j=0; j<bins[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printHistogramVertical() {
		int maxBin = bins[0];
		for (int i=0; i<bins.length; i++) {
			maxBin = (bins[i]>maxBin) ? bins[i] : maxBin;
		}
		
		System.out.println();
		for (int i=maxBin; i>=0; i--) {
			if (i == 0) {
				for (int j = 0; j<bins.length; j++) {
					int delta = (j == bins.length -1) ? 10 : 9;
					System.out.printf("%2d-%-2d ", (j*10), ((j*10)+delta));
				}
			} else {
				for (int j=0; j<bins.length; j++) {
					String str = (bins[j]<i) ? " " : "*";
					System.out.printf("%3s%-2s ", str, " ");
				}
			}
			System.out.println();
		}
	}
	
}