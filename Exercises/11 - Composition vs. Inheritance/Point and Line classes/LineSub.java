//	inheritance subexercise
//	LineSub subclass of Point superclass
//	a LineSub (more properly a line model object) inherits the beginning point
//	from the Point superclass, and extends the beginning point with its own endpoint
//	-end:Point
//	+LineSub(beginX:int, beginY:int, endX:int, endY:int)
//	+LineSub(begin:Point, end:Point)
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
//	+getArgument():double
//	+getArgDeg():double

public class LineSub extends Point {
	
	//	private member fields (variables)
	private Point end;
	
	//	constructors
	//	+LineSub(beginX:int, beginY:int, endX:int, endY:int)
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		end = new Point(endX, endY);
	}
	
	//	+LineSub(begin:Point, end:Point)
	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());	// use superclass constructor, requires Point object member variables
		this.end = end;	// endpoint of line model object is contained in LineSub instance
	}
	
	//	getters
	//	+getBegin():Point
	public Point getBegin() {
		return this;	// upcast to Point object (polymorphism)
	}
	
	//	+getEnd():Point
	public Point getEnd() {
		return end;
	}
	
	//	+getBeginX():int
	public int getBeginX() {
		return getX();	// inherited getX() method
	}
	
	//	+getBeginY():int
	public int getBeginY() {
		return getY();	// inherited getY() method
	}
	
	//	+getEndX():int
	public int getEndX() {
		return end.getX();
	}
	
	//	+getEndY():int
	public int getEndY() {
		return end.getY();
	}
	
	//	setters
	//	+setBegin(begin:Point):void
	public void setBegin(Point begin) {
		super.setX(begin.getX());
		super.setY(begin.getY());
	}
	
	//	+setBeginX(x:int):void
	public void setBeginX(int x) {
		setX(x);	// inherited setX(...) method
	}
	
	//	+setBeginY(y:int):void
	public void setBeginY(int y) {
		setY(y);	// inherited setY(...) method
	}
	
	//	+setBeginXY(x:int, y:int):void
	public void setBeginXY(int x, int y) {
		setX(x);	// inherited setX(...) method
		setY(y);	// inherited setY(...) method
	}
	
	//	+setEnd(end:Point):void
	public void setEnd(Point end) {
		this.end = end;
	}
	
	//	+setEndX(x:int):void
	public void setEndX(int x) {
		end.setX(x);
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
	
	//	public methods
	//	+toString():String
	public String toString() {
		return "line from " + super.toString() + " to " + end;
	}
	
	//	helper method
	public int[] getDelta() {
		int[] output = new int[2];
		output[0] = getBeginX() - getEndX();
		output[1] = getBeginY() - getEndY();
		return output;
	}
	
	//	+getLength():double
	public double getLength() {
		return Math.sqrt(getDelta()[0]*getDelta()[0] + getDelta()[1]*getDelta()[1]);
	}
	
	//	+getArgument():double
	public double getArgument() {
		return Math.atan2(getDelta()[1], getDelta()[0]);
	}
	
	//	+getArgDeg():double
	public double getArgDeg() {
		return Math.toDegrees(getArgument());
	}
}
