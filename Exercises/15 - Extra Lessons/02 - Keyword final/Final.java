/**
* the 'final' keyword:
* a final class cannot be sub-classed (or extended). a final method can't be overridden in subclasses. a final variable cannot be re-mapped to a new value.
* a final variable of primitive type is a constant. a 'public static final' variable of primitive type is a global constant. examples below.
*/

public class Final {
	
	public static void main(String[] args) {
		public static final double PI = 3.141592653589793;
		public static final double E = 2.718281828459045;
		
		public static final int MAX_VALUE = 2147483647;
		public static final int MIN_VALUE = -2147483648;
		public static final int SIZE = 32;
		
		System.out.println(PI + "\n" + Math.PI);
		System.out.println(E + "\n" + Math.E);
		System.out.println(MAX_VALUE + "\n" + Integer.MAX_VALUE);
		System.out.println(MIN_VALUE + "\n" + Integer.MIN_VALUE);
		System.out.println(SIZE + "\n" + Integer.SIZE);
	}	
}
