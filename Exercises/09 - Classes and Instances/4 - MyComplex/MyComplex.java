//	MyComplex model class
//	-re:double
//	-im:double
//	+MyComplex(re:double, im:double)
//	+getRe():double
//	+getIm():double
//	+setRe(re:double):void
//	+setIm(im:double):void
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

public class MyComplex {
	
	// private member fields (variables)
	private double re;
	private double im;
	
	// public constructor
	public MyComplex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	// getters
	public double getRe() {
		return this.re;
	}
	
	public double getIm() {
		return this.im;
	}
	
	// setters
	public void setRe(double re) {
		this.re = re;
	}
	
	public void setIm(double im) {
		this.im = im;
	}
	
	public void setValue(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	// toString()
	public String toString() {
		return "(" + this.re + " + " + this.im + "i)";
	}
	
	// public methods
	//	+isReal():boolean
	public boolean isReal() {
		return (this.im == 0);
	}
	
	//	+isImaginary():boolean
	public boolean isImaginary() {
		return (this.re == 0);
	}
	
	//	+equals(re:double, im:double):boolean
	public boolean equals(double re, double im) {
		return ((this.re == re) && (this.im == im));
	}
	
	//	+equals(another:MyComplex):boolean
	public boolean equals(MyComplex another) {
		return equals(another.getRe(), another.getIm());
	}
	
	//	+magnitude():double
	public double magnitude() {
		return Math.sqrt(this.re*this.re + this.im*this.im);
	}
	
	//	+argumentInRadians():double
	public double argumentInRadians() {
		return Math.atan2(this.im, this.re);
	}
	
	//	+argumentInDegrees():int
	public int argumentInDegrees() {
		return (int)Math.atan2(this.im, this.re);
	}
	
	//	+conjugate():MyComplex
	public MyComplex conjugate() {
		return new MyComplex(this.re, (-1)*this.im);
	}
	
	//	+add(another:MyComplex):MyComplex
	public MyComplex add(MyComplex another) {
		return new MyComplex(this.re + another.getRe(), this.im + another.getIm());
	}
	
	//	+subtract(another:MyComplex):MyComplex
	public MyComplex subtract(MyComplex another) {
		return new MyComplex(this.re - another.getRe(), this.im - another.getIm());
	}
	
	//	+multiplyWith(another:MyComplex):MyComplex
	public MyComplex multiplyWith(MyComplex another) {
		this.re = this.re*another.getRe()-this.im*another.getIm();
		this.im = this.re*another.getIm()+this.im*another.getRe();
		return this;
	}
	
	//	+divideBy(another:MyComplex):MyComplex
	public MyComplex divideBy(MyComplex another) {
		if ((another.getRe()*another.getRe() + another.getIm()*another.getIm()) == 0) {
			return null;
		} else {
			this.multiplyWith(another.conjugate());
			double denominator = (another.getRe()*another.getRe() + another.getIm()*another.getIm());
			this.setValue((this.re)/denominator, (this.im)/denominator);
			return this;
		}
	}
}
