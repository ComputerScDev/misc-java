/** Polymorphism continued:
superclass defines the expected behaviors (public interface) of all its subclasses,
(programming at the public interface level).
subclasses provide the actual implementation.
*/

//	WaterMonster subclass of Monster superclass - using inheritance

public class WaterMonster extends Monster {
	
	//	constructor
	public WaterMonster(String name) {
		super(name);
	}
	
	//	subclass provides actual implementation
	@Override
	public String attack() {
		return "attack with water!";
	}
}
