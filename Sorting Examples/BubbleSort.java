import java.util.Scanner;

// Bubble Sort

public class BubbleSort {
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter # of elements to sort: ");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Input the elements: ");
		for (int i = 0; i < size; i++) {
			System.out.println("Element #" + (i+1) + ":");
			array[i] = in.nextInt();
		}
		
		System.out.println("Below is your unsorted set: ");
		printArray(array);
		
		// Algorithm begins here.
		for (int i = 0; i < (array.length-1); i++) {
			for (int j = 0; j< (array.length-1); j++) {
				if (array[j] > array[j+1]) {
					int t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
				}
			}
			System.out.println("End of pass #" + (i+1) + ": ");
			printArray(array);
		}
		
		// Final sorted array:
		System.out.println("Sorted set: ");
		printArray(array);
	}
	
}