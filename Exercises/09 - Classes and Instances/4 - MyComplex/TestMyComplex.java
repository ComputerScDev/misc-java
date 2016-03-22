public class TestMyComplex {
	
	public static void main(String[] args) {
		MyComplex c1 = new MyComplex(1, 0);
		System.out.println("first complex # is " + c1.toString());
		System.out.println(c1.toString() + " is " + (c1.isReal() ? "" : "NOT") + " a pure real number");
		System.out.println(c1.toString() + " is " + (c1.isImaginary() ? "" : "NOT") + " a pure imaginary number");
		
		MyComplex c2 = new MyComplex(0, 1);
		System.out.println("first complex # is " + c2.toString());
		System.out.println(c2.toString() + " is " + (c2.isReal() ? "" : "NOT") + " a pure real number");
		System.out.println(c2.toString() + " is " + (c2.isImaginary() ? "" : "NOT") + " a pure imaginary number");
		
		System.out.println(c1.toString() + " is " + (c1.equals(c2) ? "" : "NOT") + " equal to " + c2.toString());
		System.out.println(c1.toString() + " + " + c2.toString() + " = " + c1.add(c2));
		System.out.println(c1.toString() + " - " + c2.toString() + " = " + c1.subtract(c2));
	}
	
}
