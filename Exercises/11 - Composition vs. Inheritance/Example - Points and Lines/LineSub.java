//	Inheritance example
//	"A line is a point extended by another point"
//	LineSub line subclass of Point superclass
//	-end:Point
//	+LineSub(x1:int, y1:int, x2:int, y2:int)
//	+LineSub(Point begin, Point end)
//	+getBegin():Point
//	+setBegin(begin:Point):void
//	+getBeginX():int
//	+setBeginX(x:int):void
//	+getBeginY():int
//	+setBeginY(y:int):void
//	+setBeginXY(x:int, y:int):void
//	+getEnd():Point
//	+setEnd(end:Point):void
//	+getEndX():int
//	+setEndX(x:int):void
//	+getEndY():int
//	+setEndY(y:int):void
//	+setEndXY(x:int, y:int):void
//	+toString():String
//	+getLength():double

public class LineSub extends Point {
	
	private Point end;
	
	//	constructor
	//	+LineSub(x1:int, y1:int, x2:int, y2:int)
	public LineSub(int x1, int y1, int x2, int y2) {
		super(x1, y1);
		end = new Point(x2, y2);	// construct point instances
	}
	
	//	+LineSub(begin:Point, end:Point)
	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());	// construct beginning point
		this.end = end;
	}
	
	//	'Begin' methods
	//	+getBegin():Point
	public Point getBegin() {
		return this;	// upcast to Point (polymorphism)
	}
	
	//	+setBegin(begin:Point):void
	public void setBegin(Point begin) {
		super.setX(begin.getX());
		super.setY(begin.getY());
	}
	
	//	+getBeginX():int
	public int getBeginX() {
		return super.getX();	// inherited, 'super' keyword is optional
	}
	
	//	+setBeginX(x:int):void
	public void setBeginX(int x) {
		super.setX(x);	// inherited, 'super' keyword is optional
	}
	
	//	+getBeginY():int
	public int getBeginY() {
		return super.getY();
	}
	
	//	+setBeginY(y:int):void
	public void setBeginY(int y) {
		super.setY(y);
	}
	
	//	+setBeginXY(x:int, y:int):void
	public void setBeginXY(int x, int y) {
		super.setX(x);
		super.setY(y);
	}
	
	//	'End' methods
	//	+getEnd():Point
	public Point getEnd() {
		return end;
	}
	
	//	+setEnd(end:Point):void
	public void setEnd(Point end) {
		this.end = end;
	}
	
	//	+getEndX():int
	public int getEndX() {
		return end.getX();
	}
	
	//	+setEndX(x:int):void
	public void setEndX(int x) {
		end.setX(x);
	}
	
	//	+getEndY():int
	public int getEndY() {
		return end.getY();
	}
	
	//	+setEndY(y:int):void
	public void setEndY(int y) {
		end.setY(y);
	}
	
	//	+setEndXY(x:int, y:int):void
	public void setEndXY(int x, int y) {
		end.setX(x);
		end.setY(y);
	}
	
	//	+toString():String
	public String toString() {
		return "line from " + super.toString() + " to " + end;
	}
	
	//	+getLength():double
	public double getLength() {
		int xDiff = super.getX() - end.getX();
		int yDiff = super.getY() - end.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}
