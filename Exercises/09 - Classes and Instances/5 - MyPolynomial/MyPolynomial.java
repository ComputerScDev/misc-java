//	MyPolynomial model class
//	-coeffs:double[]
//	+MyPolynomial(coeffs:double...)
//	+MyPolynomial(filename:String)
//	+getDegree():int
//	+toString():String
//	+evaluate(x:double):double
//	+add(another:MyPolynomial):MyPolynomial
//	+multiply(another:MyPolynomial):MyPolynomial

public class MyPolynomial {
	
	// polynomial uniquely defined by its coefficients
	private double[] coeffs;
	
	// constructors
	public MyPolynomial(double... coeffs) {	// varargs
		this.coeffs = coeffs;	// varargs is treated as array
	}
	
	public MyPolynomial(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename));	// open file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int degree = in.nextInt();	// read the degree
		coeffs = new double[degree + 1];	// allocate the array
		for (int i = 0; i < coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}
	}
	
	// get degree
	public int getDegree() {
		return this.coeffs.length - 1;
	}
		
}
