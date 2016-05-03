public class Shape {
	
	private String colour;
	private boolean filled;
	private static final String DEFAULT_COLOUR = "green";
	private static final boolean DEFAULT_FILLED = true;
	
	/**
	 * constructors
	 */
	public Shape() {
		colour = DEFAULT_COLOUR;
		filled = DEFAULT_FILLED;
	}

	public Shape(String colour, boolean filled) {
		this.colour = colour;
		this.filled = filled;
	}
	
	/**
	 * getters and setters
	 */
	public String getColour() {
		return colour;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**
	 * public method
	 */
	public String toString() {
		return "a shape of colour " + colour + " which " + (isFilled() ? "is filled." : "is not filled.");
	}
}
