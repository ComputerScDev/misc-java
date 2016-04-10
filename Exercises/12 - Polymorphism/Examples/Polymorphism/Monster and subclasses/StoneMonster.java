/** Polymorphism continued:
superclass defines the expected behaviors (public interface) of all its subclasses,
(programming at the public interface level).
subclasses provide the actual implementation.
*/

//	StoneMonster subclass of Monster superclass - using inheritance

public class StoneMonster extends Monster {
	
	//	constructor
	public StoneMonster(String name) {
		super(name);
	}
	
	//	subclass provides actual implementation
	@Override
	public String attack() {
		return "attack with stone!";
	}
}
