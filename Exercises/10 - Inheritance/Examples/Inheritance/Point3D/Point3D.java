//	Point3D subclass of Point superclass
//	-z:int
//	+Point3D()
//	+Point3D(x:int, y:int, z:int)
//	+getZ():int
//	+setZ(z:int):void
//	+toString():String

public class Point3D extends Point {
	
	//	private member field (variable)
	private int z;
	
	//	constructors
	//	default no-arg constructor
	public Point3D() {
		super();	// calls superclass' no-arg constructor Point()
		z = 0;
	}
	
	//	three-argument constructor
	public Point3D(int x, int y, int z) {
		super(x, y);	// calls superclass' two-argument constructor Point(x, y)
		this.z = z;
	}
	
	//	getter
	public int getZ() {
		return z;
	}
	
	//	setter
	public void setZ(int z) {
		this.z = z;
	}
	
	//	override toString() method
	@Override
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ", " + this.getZ() + ")";
	}
}
