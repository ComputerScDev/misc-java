/**
* 3D Point model subclass of 2D Point model superclass
* 	-z:float = 0.0f
* 	+Point3D()
* 	+Point3D(x:float, y:float, z:float)
* 	+getZ():float
* 	+setZ(z:float):void
* 	+setXYZ(x:float, y:float, z:float):void
* 	+getXYZ():float[3]
* 	+toString():String
*/

public class Point3D extends Point2D {
	
	/**
	* -z:float = 0.0f
	*/
	private float z;
	
	/**
	* constructors
	* +Point3D()
	*/
	public Point3D() {
		super();
		this.z = super.DEFAULT_VALUE;
	}
	
	/**
	* +Point3D(x:float, y:float, z:float)
	*/
	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}
	
	/**
	* +getZ():float
	*/
	public float getZ() {
		return z;
	}
	
	/**
	* +getXYZ():float[3]
	*/
	public float[] getXYZ() {
		float[] getXYZ = new float[3];
		getXYZ[0] = super.getX() ;
		getXYZ[1] = super.getY() ;
		getXYZ[2] = z;
		return getXYZ;
	}
	
	/**
	* +setZ(z:float):void
	*/
	public void setZ(float z) {
		this.z = z;
	}
	
	/**
	* +setXYZ(x:float, y:float, z:float):void
	*/
	public void setXYZ(float x, float y, float z) {
		super.setXY(x, y);
		this.z = z;
	}
	
	/**
	* +toString():String
	*/
	@Override
	public String toString() {
		return "(" + super.getX() + ", " + super.getY()  + ", " + z + ")";
	}
}
