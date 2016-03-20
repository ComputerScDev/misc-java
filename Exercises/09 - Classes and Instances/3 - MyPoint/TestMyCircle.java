public class TestMyCircle {
	
	public static void main(String[] args) {
		MyCircle c1 = new MyCircle(1,2,3);
		MyCircle c2 = new MyCircle(new MyPoint(4,5),6);
		System.out.println("Initial circle config:");
		System.out.println("circle: " + c1.toString() + " has centre " + c1.getCentre() + " with radius " + c1.getRadius() + " and area " + c1.getArea() + ".");
		System.out.println("circle: " + c2.toString() + " has centre " + c2.getCentre() + " with radius " + c2.getRadius() + " and area " + c2.getArea() + ".");
		System.out.println("Applying changes...");
		c1.setCentre(new MyPoint(0,0));
		c2.setCentreXY(5,5);
		System.out.println("New properties:");
		System.out.println("circle: " + c1.toString() + " has centre " + "(" + c1.getCentreX() + "," + c1.getCentreY() + ")" + " with radius " + c1.getRadius() + " and area " + c1.getArea() + ".");
		System.out.println("circle: " + c2.toString() + " has centre " + "(" + c2.getCentreX() + "," + c2.getCentreY() + ")" + " with radius " + c2.getRadius() + " and area " + c2.getArea() + ".");
	}
}

// methods to test:
// MyCircle(int x, int y, int radius)
// MyCircle(MyPoint centre, int radius)
// int getRadius()
// MyPoint getCentre()
// setCentre(MyPoint centre)
// setCentreXY(int x, int y)
// int getCentreX()
// int getCentreY()
// double getArea()
// String toString()

// make two circles using the two constructors resp.
// Test string will be 
// "circle: " + toString() + " has centre" + getCentre() + " with radius " + getRadius() + " and area " + getArea() + "."
// apply change:
// first circle, change centre with setCentre(MyPoint centre). second circle, change centre with setCentreXY(int x, int y)
// after change:
// "circle: " + toString() + " has centre" + "(" + getCentreX() + "," + getCentreY + ")" + " with radius " + getRadius() + " and area " + getArea() + "."