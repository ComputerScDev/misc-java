//	Test class for Point3D subclass of Point superclass

public class TestPoint3D {
	
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		System.out.println(p1);
		System.out.println(p1.getX());	// inherited from superclass
		System.out.println(p1.getY());	// inherited from superclass
		System.out.println(p1.getZ());	// this class
		p1.setX(4);	// inherited from superclass
		p1.setY(5);	// inherited from superclass
		p1.setZ(6);	// this class
		System.out.println(p1);
	}
}
