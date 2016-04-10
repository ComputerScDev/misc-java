/** Polymorphism continued:
superclass defines the expected behaviors (public interface) of all its subclasses,
(programming at the public interface level).
subclasses provide the actual implementation.
*/

//	FireMonster subclass of Monster superclass - using inheritance

public class FireMonster extends Monster {
	
	//	constructor
	public FireMonster(String name) {
		super(name);
	}
	
	//	subclass provides actual implementation
	@Override
	public String attack() {
		return "attack with fire!";
	}
}
