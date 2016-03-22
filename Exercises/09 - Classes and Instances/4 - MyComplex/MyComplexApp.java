import java.util.Scanner;

public class MyComplexApp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first complex # (re, im): ");
		MyComplex c1 = new MyComplex(in.nextDouble(), in.nextDouble());
		System.out.print("Enter first complex # (re, im): ");
		MyComplex c2 = new MyComplex(in.nextDouble(), in.nextDouble());
		System.out.println("\nfirst complex # is " + c1.toString() + 
		"\n" + c1.toString() + "is " + (c1.isReal() ? "" : "NOT") + " a pure real #" + 
		"\n" + c1.toString() + "is " + (c1.isImaginary() ? "" : "NOT") + " a pure imaginary #" + "\n");
		System.out.println("second complex # is " + c2.toString() + 
		"\n" + c2.toString() + "is " + (c2.isReal() ? "" : "NOT") + " a pure real #" + 
		"\n" + c2.toString() + "is " + (c2.isImaginary() ? "" : "NOT") + " a pure imaginary #" + "\n");
		System.out.println(c1.toString() + " is " + (c1.equals(c2) ? "" : "NOT") + " equal to " + c2.toString());
		System.out.println(c1.toString() + " + " + c2.toString() + " = " + c1.add(c2));
		System.out.println(c1.toString() + " - " + c2.toString() + " = " + c1.subtract(c2));
	}
	
}

//	+setValue(re:double, im:double):void
//	+toString():String
//	+isReal():boolean
//	+isImaginary():boolean
//	+equals(re:double, im:double):boolean
//	+equals(another:MyComplex):boolean
//	+magnitude():double
//	+argumentInRadians():double
//	+argumentInDegrees():int
//	+conjugate():MyComplex
//	+add(another:MyComplex):MyComplex
//	+subtract(another:MyComplex):MyComplex
//	+multiplyWith(another:MyComplex):MyComplex
//	+divideBy(another:MyComplex):MyComplex