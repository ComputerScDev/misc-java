/**
* MovableCircle implements Movable interface, composing a MovablePoint object
*/

public class MovableCircle implements Movable {
	
	/**
	* instance variables
	*/
	private MovablePoint centre;	// we can use centre.x and centre.y directly since they are package accessible
	private int radius;
	
	/**
	* constructor
	*/
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		centre = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "circle with centre at " + centre.toString() + " and radius r:" + radius;
	}
	
	/**
	* implement abstract methods declared in interface
	* use composition with MovablePoint object
	*/
	@Override
	public void moveUp() {
		centre.y += centre.ySpeed;
	}
	
	@Override
	public void moveDown() {
		centre.y -= centre.ySpeed;
	}
	
	@Override
	public void moveLeft() {
		centre.x -= centre.xSpeed;
	}
	
	@Override
	public void moveRight() {
		centre.x += centre.xSpeed;
	}
}
