/**
* abstract Shape superclass
* #colour:String
* #filled:boolean
* +Shape()
* +Shape(colour:String, filled:boolean)
* +getColour():String
* +setColour(colour:String):void
* +isFilled():boolean
* +setFilled(filled:boolean):void
* +getArea():double
* +getPerimiter():double
* *toString():String
*/

abstract public class Shape {
	
	/**
	* protected member fields
	*/
	protected String colour;
	protected boolean filled;
	
	/**
	* constructors
	*/
	public Shape() {
		colour = "red";
		filled = true;
	}
	
	public Shape(String colour, boolean filled) {
		this.colour = colour;
		this.filled = filled;
	}
	
	/**
	* getters
	* +getColour():String
	* +isFilled():boolean
	*/
	public String getColour() {
		return colour;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	/**
	* setters
	* +setColour(colour:String):void
	* +setFilled(filled:boolean):void
	*/
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**
	* toString()
	*/
	@Override
	public String toString() {
		return "[shape: colour=" + colour + ", filled=" + filled + "]";
	}
	
	/**
	* abstract methods
	*/
	abstract public double getArea();
	abstract public double getPerimiter();
}
