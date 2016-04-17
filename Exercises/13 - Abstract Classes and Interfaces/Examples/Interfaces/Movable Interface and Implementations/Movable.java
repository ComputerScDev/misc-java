/**
* Movable interface
* suppose our application involves many objects that can move.
* we could define a 'Movable' interface containing the signatures
* of the various movement methods that these objects must contain.
* 
* the Movable interface defines a list of public abstract methods
* to be implemented by Movable's subclasses
*/

public interface Movable {
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}
