/**
* write a Matrix library that supports matrix operations 
* (such as addition, subtraction, multiplication) via 2D arrays. 
* The operations shall support both doubles and ints. 
* Also write a test class to exercise all the operations programmed. 
* 
* Double values are also supported. For double inputs, edit the main 
* method such that the int[][] values become double[][] values.
*/

import java.util.Scanner;

class e1matrix {
	
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int entry : row) {
				System.out.print(entry+" ");
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(double[][] matrix) {
		for (double[] row : matrix) {
			for (double entry : row) {
				System.out.print(entry+" ");
			}
			System.out.println();
		}
	}
	
	public static boolean haveSameDim(int[][] matrix1, int[][] matrix2) {
		if (matrix1.length == matrix2.length) {
			for (int i=0; i<matrix1.length; i++) {
				if (matrix1[i].length == matrix2[i].length) {
					continue;
				} else {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean haveSameDim(double[][] matrix1, double[][] matrix2) {
		if (matrix1.length == matrix2.length) {
			for (int i=0; i<matrix1.length; i++) {
				if (matrix1[i].length == matrix2[i].length) {
					continue;
				} else {
					return false;
				}
			}
			return true;
			
		} else {
			return false;
		}
	}
	
	public static int[][] add(int[][] matrix1, int[][] matrix2) {
		int[][] matrixSum = new int[matrix1.length][];
		
		for (int i=0; i<matrixSum.length; i++) {
			matrixSum[i] = matrix1[i].clone();
			for (int j=0; j<matrixSum[i].length; j++) {
				matrixSum[i][j] += matrix2[i][j];
			}
		}
		return matrixSum;
	}
	
	public static double[][] add(double[][] matrix1, double[][] matrix2) {
		double[][] matrixSum = new double[matrix1.length][];
		
		for (int i=0; i<matrixSum.length; i++) {
			matrixSum[i] = matrix1[i].clone();
			for (int j=0; j<matrixSum[i].length; j++) {
				matrixSum[i][j] += matrix2[i][j];
			}
		}
		return matrixSum;
	}
	
	public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
		int[][] matrixDiff = new int[matrix1.length][];
		
		for (int i=0; i<matrixDiff.length; i++) {
			matrixDiff[i] = matrix1[i].clone();
			for (int j=0; j<matrixDiff[i].length; j++) {
				matrixDiff[i][j] -= matrix2[i][j];
			}
		}
		return matrixDiff;
	}
	
	public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
		double[][] matrixDiff = new double[matrix1.length][];
		
		for (int i=0; i<matrixDiff.length; i++) {
			matrixDiff[i] = matrix1[i].clone();
			for (int j=0; j<matrixDiff[i].length; j++) {
				matrixDiff[i][j] += matrix2[i][j];
			}
		} 
		return matrixDiff;
	}
	
	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		int[][] matrixProduct = new int[matrix1.length][matrix2[0].length];
		
		for (int i=0; i<matrixProduct.length; i++) {
			for (int j=0; j<matrixProduct[i].length; j++) {
				matrixProduct[i][j] = 1;
				for (int k=0; k<matrix1[0].length; k++) {
					matrixProduct[i][j] *= (matrix1[i][k]*matrix2[k][j]);
				}
			}
		} 
		return matrixProduct;	
	}
	
	public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
		double[][] matrixProduct = new double[matrix1.length][matrix2[0].length];
		
		for (int i=0; i<matrixProduct.length; i++) {
			for (int j=0; j<matrixProduct[i].length; j++) {
				matrixProduct[i][j] = 1;
				for (int k=0; k<matrix1[0].length; k++) {
					matrixProduct[i][j] *= (matrix1[i][k]*matrix2[k][j]);
				}
			}
		} return matrixProduct;	
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter dimensions of first matrix: ");
		int matrix1_m = in.nextInt();
		int matrix1_n = in.nextInt();
		
		System.out.println("Enter dimensions of second matrix: ");
		int matrix2_m = in.nextInt();
		int matrix2_n = in.nextInt();
		
		int[][] matrix1 = new int[matrix1_m][matrix1_n];
		int[][] matrix2 = new int[matrix2_m][matrix2_n];
		
		for (int i=0; i<matrix1_m; i++) {
			for (int j=0; j<matrix1_n; j++) {
				matrix1[i][j] = 0;
			}
		}
		
		for (int i=0; i<matrix2_m; i++) {
			for (int j=0; j<matrix2_n; j++) {
				matrix2[i][j] = 0;
			}
		}
		
		System.out.println("Enter the entries of the first matrix:");
		for (int i=0; i<matrix1_m; i++) {
			for (int j=0; j<matrix1_n; j++) {
				matrix1[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Enter the entries of the second matrix:");
		for (int i=0; i<matrix2_m; i++) {
			for (int j=0; j<matrix2_n; j++) {
				matrix2[i][j] = in.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("First matrix:");
		e1matrix.printMatrix(matrix1);
		
		System.out.println();
		System.out.println("Second matrix:");
		e1matrix.printMatrix(matrix2);
		
		if (e1matrix.haveSameDim(matrix1, matrix2) == true) {
			System.out.println("Sum:");
			int[][] matrix3 = e1matrix.add(matrix1, matrix2);
			e1matrix.printMatrix(matrix3);
			
			System.out.println("Difference:");
			int[][] matrix4 = e1matrix.subtract(matrix1, matrix2);
			e1matrix.printMatrix(matrix4);
		} else {
			System.out.println();
			System.out.println("Invalid dimensions for sums and differences.");
			System.out.println("Both matrices must have equal dimensions.");
			System.out.println();
		}
		if (matrix1[0].length == matrix2.length) {
			System.out.println("product:");
			int[][] matrix5 = e1matrix.multiply(matrix1, matrix2);
			
			for (int i=0; i<matrix5.length; i++) {
				for (int j=0; j<matrix5[0].length; j++) {
					System.out.print(matrix5[i][j] + " ");
					if (j == matrix5[0].length-1) {
						System.out.println();
					}
				}
			}
		} else {
			System.out.println("Invalid dimensions for matrix multiplication.");
			System.out.println("Matrix 1 column dimension must equal Matrix 2 row dimension.");
		}
	}
}
