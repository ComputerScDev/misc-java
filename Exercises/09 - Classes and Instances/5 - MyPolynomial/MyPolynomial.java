import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
	//	+MyPolynomial(coeffs:double...)
	public MyPolynomial(double... coeffs) {	// varargs
		this.coeffs = coeffs;	// varargs is treated as array
	}
	
	//	+MyPolynomial(filename:String)
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
	
	//	+getDegree():int
	public int getDegree() {
		return this.coeffs.length - 1;
	}
	
	//	helper method
	private double[] getCoeffs() {
		return coeffs;
	}
	
	//	+toString():String
	public String toString() {
		StringBuilder string = new StringBuilder();
		for (int i = this.getDegree(); i >= 0; i--) {
			string.append(this.coeffs[i] + (i != 0 ? "x^" + i + " + " : ""));
		}
		return string.toString();
	}
	
	//	+evaluate(x:double):double
	public double evaluate(double x) {
		double sum = 0.0;
		for (int i = 0; i < this.getDegree() + 1; i++) {
			sum += (i == 0 ? 1.0 : x)*this.getCoeffs()[i];
		}
		return sum;
	}
	
	//	+add(another:MyPolynomial):MyPolynomial
	public MyPolynomial add(MyPolynomial another) {
		int minOfTwo = (this.getDegree() > another.getDegree() ? another.getDegree() : this.getDegree()) + 1;
		int size = (minOfTwo > another.getDegree() ? this.getDegree() : another.getDegree()) + 1;
		double[] out = new double[size];
		double[] outCoeffs;
		double[] anotherCoeffs;
		if (minOfTwo - 1 == another.getDegree()) {
			anotherCoeffs = another.getCoeffs();
			outCoeffs = this.getCoeffs();
		} else {
			anotherCoeffs = this.getCoeffs();
			outCoeffs = another.getCoeffs();
		}
		
		for (int i = 0; i < size; i++) {
			if (i > minOfTwo - 1) {
				out[i] = outCoeffs[i];
			} else {
				out[i] = outCoeffs[i] + anotherCoeffs[i];
			}
		}
		
		return new MyPolynomial(out);
	}
	
	//	+multiply(another:MyPolynomial):MyPolynomial
	public MyPolynomial multiply(MyPolynomial another) {
		int degree = another.getDegree() + this.getDegree();
		double[] out = new double[degree + 1];
		double[] thisCoeffs = this.getCoeffs();
		double[] anotherCoeffs = another.getCoeffs();
		
		for (int i = 0; i < degree + 1; i++) {
			double entry = 0.0;
			for (int j = 0; j <= i; j++) {
				if ((j > this.getDegree()) || (i - j > another.getDegree())) {
					// prevents out of bounds:
					// that is, thisCoeffs restricted from j = 0 to j = this.getDegree()
					// and anotherCoeffs restricted from i-j = 0 to i-j = another.getDegree()
					continue;
				}
				// formula: sum from j = 0 to i of (p_j)*(q_(i-j))
				entry += thisCoeffs[j]*anotherCoeffs[i-j];
			}
			out[i] = entry;
		}
		
		return new MyPolynomial(out);
	}
}
