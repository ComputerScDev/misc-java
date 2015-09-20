import java.util.Scanner;

class e3reversearray {
	
	public static void reverseArray(int[] array) {
		for (int i=0; i<array.length/2; i++) {
			swap(array, i, array.length-i-1);
		}
	}
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			array[i] = in.nextInt();
		}
		reverseArray(array);
		for (int i = 0; i<size; i++) {
			System.out.print(array[i]);
			if (i<size-1) {
				System.out.print(" ");
			}
		}
	}
	
}


/* Write a method called reverseArray() with the following signature:

public static void reverseArray(int[] intArray)

The method accepts an int array, and reverses its orders. 
For example, if the input array is {12, 56, 34, 79, 26}, the reversal 
is {26, 79, 34, 56, 12}. You MUST NOT use another array in your method 
(but you need a temporary variable to do the swap). Also write a test class 
called ReverseArrayTest to test this method.

Take note that the array passed into the method can be modified by the method 
(this is called "pass by reference"). On the other hand, primitives passed into 
a method cannot be modified. This is because a clone is created and passed into 
the method instead of the original copy (this is called "pass by value"). */

/* Sample input/output:
input data:
8
3 1 4 1 5 9 2 6

answer:
6 2 9 5 1 4 1 3 */