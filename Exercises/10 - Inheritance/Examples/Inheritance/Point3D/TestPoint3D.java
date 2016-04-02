//	Test class for Point3D subclass of Point superclass

public class TestPoint3D {
	
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		System.out.println(p1);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p1.getZ());
		p1.setX(4);
		p1.setY(5);
		p1.setZ(6);
		System.out.println(p1);
	}
}
