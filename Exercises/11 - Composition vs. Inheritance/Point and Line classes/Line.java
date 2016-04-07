//	composition subexercise
//	"a line is composed of two points"
//	Line subclass of Point model class
//	-begin:Point
//	-end:Point
//	+Line(begin:Point, end:Point)
//	+Line(beginX:int, beginY:int, endX:int, endY:int)
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
//	+getLength():int
//	+getArgument():double

public class Line {
	
	//	private member fields (variables)
	//	a Line object is composed of two Point objects
	private Point begin;
	private Point end;
	
	//	constructors
	//	+Line(begin:Point, end:Point)
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}
	
	//	+Line(beginX:int, beginY:int, endX:int, endY:int)
	public Line(int beginX, int beginY, int endX, int endY) {
		this.begin = new Point(beginX, beginY);
		this.end = new Point(endX, endY);
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
		return this.begin.getX();	// use inherited Point method
	}
	
	//	+getBeginY():int
	public int getBeginY() {
		return this.begin.getY();	// use inherited Point method
	}
	
	//	+getEndX():int
	public int getEndX() {
		return this.end.getX();	// use inherited Point method
	}
	
	//	+getEndY():int
	public int getEndY() {
		return this.end.getY();	// use inherited Point method
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
		this.begin.setX(x);	// use inherited Point method
	}
	
	//	+setBeginY(y:int):void
	public void setBeginY(int y) {
		this.begin.setY(y);	// use inherited Point method
	}
	
	//	+setBeginXY(x:int, y:int):void
	public void setBeginXY(int x, int y) {
		this.begin.setX(x);	// use inherited Point method
		this.begin.setY(y);	// use inherited Point method
	}
	
	//	+setEndX(x:int):void
	public void setEndX(int x) {
		this.end.setX(x);	// use inherited Point method
	}
	
	//	+setEndY(y:int):void
	public void setEndY(int y) {
		this.end.setY(y);	// use inherited Point method
	}
	
	//	+setEndXY(x:int, y:int):void
	public void setEndXY(int x, int y) {
		this.end.setX(x);	// use inherited Point method
		this.end.setY(y);	// use inherited Point method
	}
	
	//	public methods
	//	+toString():String
	public String toString() {
		return "line from " + begin + " to " + end + ".";
	}
	
	//	helper method
	public int[] getDelta() {
		int[] output = new int[2];
		output[0] = begin.getX() - end.getX();
		output[1] = begin.getY() - end.getY();
		return output;
	}
	
	//	+getLength():int
	public int getLength() {
		//int deltaX = begin.getX() - end.getX();
		//int deltaY = begin.getY() - end.getY();
		
		return (int)Math.sqrt(getDelta()[0]*getDelta()[0] + getDelta()[1]*getDelta()[1]);
	}
	
	//	+getArgument():double
	//	degrees between x-axis and line
	public double getArgument() {
		return Math.atan2(getDelta()[1], getDelta()[0]);
	}
	
	public double getArgDeg() {
		return Math.toDegrees(getArgument());
	}
}
