/**
 * compose the Line class with two Point objects from the Point class
 * i.e. re-use the Point class via composition
 * "a line is composed of two points"
 * composition exhibits a "has-a" relationship
 * in UML, composition is represented as a diamond-head line
 * pointing to its constituents
 */

public class Line {
	
	/**
	 * private member fields (variables)
	 */
	private Point begin;
	private Point end;
	
	/**
	 * constructors
	 */
	public Line(int x1, int y1, int x2, int y2) {
		this.begin = new Point(x1, y1);
		this.end = new Point(x2, y2);
	}
	
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}
	
	/**
	 * getters and setters
	 */
	public Point getBegin() {
		return this.begin;
	}
	
	public Point getEnd() {
		return this.end;
	}
	
	public int getBeginX() {
		return this.begin.getX();
	}
	
	public int getBeginY() {
		return this.begin.getY();
	}
	
	public int getEndX() {
		return this.end.getX();
	}
	
	public int getEndY() {
		return this.end.getY();
	}
	
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	
	public void setEnd(Point end) {
		this.end = end;
	}
	
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	public void setBeginXY(int x, int y) {
		this.begin.setX(x);
		this.begin.setY(y);
	}
	
	public void setEndX(int x) {
		this.end.setX(x);
	}
	
	public void setEndY(int y) {
		this.end.setY(y);
	}
	
	public void setEndXY(int x, int y) {
		this.end.setX(x);
		this.end.setY(y);
	}
	
	/**
	 * public methods
	 */
	public String toString() {
		return "line from " + this.begin + " to " + this.end + ".";
	}
	
	public double getLength() {
		int xDiff = this.begin.getX() - this.end.getX();
		int yDiff = this.begin.getY() - this.end.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}	
}
