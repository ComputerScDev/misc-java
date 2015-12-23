import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void print(ArrayList x, String str) {
		System.out.print(str + ": ");
		for (int i = 0; i < x.size(); i++) {
			System.out.print(x.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		for (int i = 0; i < 4; i++) {
			x.add(i*2);
		}
		print(x, "A");
		
		int sum = 0;
		for (int i = 0; i < x.size(); i++) {
			sum += x.get(i); // or x[i]
		}
		
		System.out.println("Sum = " + sum);
		System.out.println();
		
		x.add(4);
		print(x, "B");
		x.add(0, 4);
		print(x, "C");
		
		System.out.println();
		System.out.println("indexOf(4) = " + x.indexOf(4));
		System.out.println("lastIndexOf(4) = " + x.lastIndexOf(4));
		System.out.println();
		
		x.remove(0);
		print(x, "D");
		x.remove(new Integer(6));
		print(x, "E");
		x.set(0, 9);
		print(x, "F");
		System.out.println();
		
		ArrayList<Integer> x2 = x;
		print(x2, "G");
		x2.set(0, 33);
		print(x2, "H");
		print(x, "I");
		
	}
}
