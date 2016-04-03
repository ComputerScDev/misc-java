//	Square model subclass of Rectangle subclass of Shape superclass
//	+Square()
//	+Square(side:double)
//	+Square(side:double, colour:String, filled:boolean)
//	+getSide():double
//	+setSide(side:double):void
//	+setWidth(side:double):void
//	+setLength(side:double):void
//	+toString():String

public class Square extends Rectangle {	
	
	//	constructors
	//	+Square()
	public Square() {
		super();	// instantiates a unit square
	}
	
	//	+Square(side:double)
	public Square(double side) {
		super(side, side);	// instantiates a side*side square
	}
	
	//	+Square(side:double, colour:String, filled:boolean)
	public Square(double side, String colour, boolean filled) {
		super(side, side, colour, filled);
	}
	
	//	getter
	//	+getSide():double
	public double getSide() {
		return this.getLength();
	}
	
	//	setters
	//	+setSide(side:double):void
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	//	+setWidth(side:double):void
	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	
	//	+setLength(side:double):void
	@Override
	public void setLength(double side) {
		setSide(side);
	}
	
	//	+toString():String
	@Override
	public String toString() {
		return "a square with side length " + getSide() + ", a subclass of " + super.toString();
	}
}
