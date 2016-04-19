/**
* Test driver for Movable interface
*/

public class TestMovable {
	
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 9, 10);	// upcast (programming at interface level)
		System.out.println("new point: " + m1);
		m1.moveLeft();
		System.out.println("moving left:\n" + m1 + "\n");
		Movable m2 = new MovableCircle(2, 1, 2, 1, 20);	// upcast (programming at interface level)
		System.out.println("new circle: " + m2);
		m2.moveRight();
		System.out.println("moving right:\n" + m2 + "\n");
		Movable m3 = new MovableRectangle(-1, 1, 1, -1, 10, 10);	// upcast (programming at interface level)
		System.out.println("new rectangle: " + m3);
		m3.moveUp();
		System.out.println("moving up:\n" + m3);
	}
}
