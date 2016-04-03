//	Shape model superclass
//	-colour:String = "green"
//	-filled:boolean = "true"
//	+Shape()
//	+Shape(colour:String, filled:boolean)
//	+getColour():String
//	+setColour(colour:String):void
//	+isFilled():boolean
//	+setFilled(filled:boolean):void
//	+toString():String

public class Shape {
	
	private String colour;
	private boolean filled;
	private static final String DEFAULT_COLOUR = "green";
	private static final boolean DEFAULT_FILLED = true;
	
	//	constructors
	//	+Shape()
	public Shape() {
		colour = DEFAULT_COLOUR;
		filled = DEFAULT_FILLED;
	}
	
	//	+Shape(colour:String, filled:boolean)
	public Shape(String colour, boolean filled) {
		this.colour = colour;
		this.filled = filled;
	}
	
	//	getters
	//	+getColour():String
	public String getColour() {
		return colour;
	}
	
	//	+isFilled():boolean
	public boolean isFilled() {
		return filled;
	}
	
	//	setters
	//	+setColour(colour:String):void
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	//	+setFilled(filled:boolean):void
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//	+toString():String
	public String toString() {
		return "a shape of colour " + colour + " which " + (isFilled() ? "is filled." : "is not filled.");
	}
}
