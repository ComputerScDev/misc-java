//	Test class for Cylinder subclass of Circle superclass

public class TestCylinder {
	
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		System.out.println("cylinder radius is " + c1.getRadius()
		+ ", height is " + c1.getHeight()
		+ ", colour is " + c1.getColour()
		+ ", base area is " + c1.getArea()
		+ ", volume is " + c1.getVolume());
		
		Cylinder c2 = new Cylinder(5.0, 2.0);
		System.out.println("cylinder radius is " + c2.getRadius()
		+ ", height is " + c2.getHeight()
		+ ", colour is " + c2.getColour()
		+ ", base area is " + c2.getArea()
		+ ", volume is " + c2.getVolume());
	}	
}
