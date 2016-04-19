/**
* Square subclass of Rectangle superclass
* +Square()
* +Square(side:double)
* +Square(side:double, colour:String, filled:boolean);
* +getSide():double
* +setSide(side:double):void
* +setWidth(side:double):void
* +setLength(side:double):void
* +toString():String
*/

public class Square extends Rectangle {
	
	/**
	* constructors
	*/
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String colour, boolean filled) {
		super(side, side, colour, filled);
	}
	
	/**
	* getter and setter for side variable
	*/
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	/**
	* toString()
	*/
	@Override
	public String toString() {
		return "[square: instance=" + super.toString() + ", side=" + this.getSide() + "]";
	}
	
	/**
	* overrided inherited methods
	*/
	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	
	@Override
	public void setLength(double side) {
		setSide(side);
	}
}
