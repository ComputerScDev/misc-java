/**
* Test driver for MovablePoint subclass of Point superclass
*/

public class TestMovablePoint {
	
	public static void main(String[] args) {
		MovablePoint A = new MovablePoint();
		MovablePoint B = new MovablePoint(1.0f, 1.0f, 0.0f, 0.0f);
		MovablePoint C = new MovablePoint(1.0f, 1.0f, 1.0f, 1.0f);
		System.out.println(A + "\n" + B + "\n" + C + "\n");
		A.move();
		B.move();
		C.move();
		System.out.println(A + "\n" + B + "\n" + C + "\n");
	}
}
