/**
* MovablePoint implements Movable interface
*/

public class MovablePoint implements Movable {
	
	/**
	* package access instance variables
	*/
	int x, y, xSpeed, ySpeed;
	
	/**
	* constructor
	*/
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return "point (" + x + ", " + y + ") with x-speed:" + xSpeed + ", y-speed:" + ySpeed;
	}
	
	/**
	* implement abstract methods declared in interface
	*/
	@Override
	public void moveUp() {
		y += ySpeed;
	}
	
	@Override
	public void moveDown() {
		y -= ySpeed;
	}
	
	@Override
	public void moveLeft() {
		x -= xSpeed;
	}
	
	@Override
	public void moveRight() {
		x += xSpeed;
	}
}
