//	compose the Line class with two Point objects from the Point class
//	i.e. re-use the Point class via composition
//	"a line is composed of two points"
//	composition exhibits a "has-a" relationship
//	in UML, composition is represented as a diamond-head line
//	pointing to its constituents

//	Line model class
//	-begin:Point
//	-end:Point
//	+Line(x1:int, y1:int, x2:int, y2:int)
//	+Line(begin:Point, end:Point)
//	+getBegin():Point
//	+getEnd():Point
//	+getBeginX():int
//	+getBeginY():int
//	+getEndX():int
//	+getEndY():int
//	+setBegin(begin:Point):void
//	+setEnd(end:Point):void
//	+setBeginX(x:int):void
//	+setBeginY(y:int):void
//	+setBeginXY(x:int, y:int):void
//	+setEndX(x:int):void
//	+setEndY(y:int):void
//	+setEndXY(x:int, y:int):void
//	+toString():String
//	+getLength():double

public class Line {
	
	//	private member fields (variables)
	private Point begin;
	private Point end;
	
	//	constructors
	//	+Line(x1:int, y1:int, x2:int, y2:int)
	public Line(int x1, int y1, int x2, int y2) {
		this.begin = new Point(x1, y1);
		this.end = new Point(x2, y2);
	}
	
	//	+Line(begin:Point, end:Point)
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}
	
	//	getters
	//	+getBegin():Point
	public Point getBegin() {
		return this.begin;
	}
	
	//	+getEnd():Point
	public Point getEnd() {
		return this.end;
	}
	
	//	+getBeginX():int
	public int getBeginX() {
		return this.begin.getX();
	}
	
	//	+getBeginY():int
	public int getBeginY() {
		return this.begin.getY();
	}
	
	//	+getEndX():int
	public int getEndX() {
		return this.end.getX();
	}
	
	//	+getEndY():int
	public int getEndY() {
		return this.end.getY();
	}
	
	//	setters
	//	+setBegin(begin:Point):void
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	
	//	+setEnd(end:Point):void
	public void setEnd(Point end) {
		this.end = end;
	}
	
	//	+setBeginX(x:int):void
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	
	//	+setBeginY(y:int):void
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	//	+setBeginXY(x:int, y:int):void
	public void setBeginXY(int x, int y) {
		this.begin.setX(x);
		this.begin.setY(y);
	}
	
	//	+setEndX(x:int):void
	public void setEndX(int x) {
		this.end.setX(x);
	}
	
	//	+setEndY(y:int):void
	public void setEndY(int y) {
		this.end.setY(y);
	}
	
	//	+setEndXY(x:int, y:int):void
	public void setEndXY(int x, int y) {
		this.end.setX(x);
		this.end.setY(y);
	}
	
	//	other methods
	//	+toString():String
	public String toString() {
		return "line from " + this.begin + " to " + this.end + ".";
	}
	
	//	+getLength():double
	public double getLength() {
		int xDiff = this.begin.getX() - this.end.getX();
		int yDiff = this.begin.getY() - this.end.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}	
}
