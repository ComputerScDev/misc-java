/**
* Test driver for Movable interface
*/

public class TestMovable {
	
	public static void main(String[] args) {
		MovablePoint p1 = new MovablePoint(1, 2);
		System.out.println(p1);
		p1.moveDown();
		System.out.println("moving down...\n" + p1);
		p1.moveRight();
		System.out.println("moving right...\n" + p1 + "\n");
		
		/**
		* Test Polymorphism
		*/
		Movable p2 = new MovablePoint(3, 4);	// upcast (programming at the interface)
		System.out.println(p2);
		p2.moveUp();
		System.out.println("moving up...\n" + p2);
		p2.moveLeft();
		System.out.println("moving left...\n" + p2 + "\n");
		
		MovablePoint p3 = (MovablePoint)p2;	// downcast
		System.out.println("downcasted p2...\n" + p3);
	}
}
