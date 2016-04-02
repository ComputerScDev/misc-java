//	Point3D subclass of Point superclass
//	-z:int
//	+Point3D()
//	+Point3D(x:int, y:int, z:int)
//	+getZ():int
//	+setZ(z:int):void
//	+toString():String

public class Point3D extends Point {
	
	private int z;
	
	public Point3D() {
		super();
		z = 0;
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ", " + this.getZ() + ")";
	}
}
