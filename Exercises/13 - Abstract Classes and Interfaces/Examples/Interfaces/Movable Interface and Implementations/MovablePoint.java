/**
* MovablePoint subclass
* note that subclass implementing an interface must override
* all abstract methods in interface, otherwise the subclass
* can't compile.
*/

public class MovablePoint implements Movable {
	
	/**
	* private member variables
	*/
	private int x, y;	// (x, y) co-ordinates of point
	
	/**
	* constructor
	*/
	public MovablePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	/**
	* need to implement all abstract methods
	* defined in the interface Movable
	*/
	
	@Override
	public void moveUp() {
		y++;
	}
	
	@Override
	public void moveDown() {
		y--;
	}
	
	@Override
	public void moveLeft() {
		x--;
	}
	
	@Override
	public void moveRight() {
		x++;
	}
}
