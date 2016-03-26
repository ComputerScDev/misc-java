// Test class for MyPolynomial model class.

public class TestMyPolynomial {
	
	public static void main(String[] args) {
		MyPolynomial p1 = new MyPolynomial(3, 2, 1, 6);
		double[] coeffs = {3, 4, 7};
		MyPolynomial p2 = new MyPolynomial(coeffs);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("\nAdding: ");
		MyPolynomial p3 = p1.add(p2);
		System.out.println(p3.toString());
		System.out.println("\nMultiplying: ");
		System.out.println(p1.multiply(p2).toString());
	}
	
}
