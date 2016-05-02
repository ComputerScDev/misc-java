/**
 * Test method for Cylinder subclass of Circle superclass
 */
 
public class TestCylinder {
	
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();	// no-arg constructor
		System.out.println("cylinder #1 properties:\n"
		+ "radius = " + c1.getRadius() + "\n"
		+ "height = " + c1.getHeight() + "\n"
		+ "base area = " + c1.getBaseArea() + "\n"
		+ "surface area = " + c1.getArea() + "\n"
		+ "volume = " + c1.getVolume() + "\n"
		+ c1.toString() + "\n");
		
		Cylinder c2 = new Cylinder(10.0);	// one-arg constructor
		System.out.println("cylinder #2 properties:\n"
		+ "radius = " + c2.getRadius() + "\n"
		+ "height = " + c2.getHeight() + "\n"
		+ "base area = " + c2.getBaseArea() + "\n"
		+ "surface area = " + c2.getArea() + "\n"
		+ "volume = " + c2.getVolume() + "\n"
		+ c2.toString() + "\n");
		
		Cylinder c3 = new Cylinder(2.0, 10.0);	// two-arg constructor
		System.out.println("cylinder #3 properties:\n"
		+ "radius = " + c3.getRadius() + "\n"
		+ "height = " + c3.getHeight() + "\n"
		+ "base area = " + c3.getBaseArea() + "\n"
		+ "surface area = " + c3.getArea() + "\n"
		+ "volume = " + c3.getVolume() + "\n"
		+ c3.toString());
	}
}
