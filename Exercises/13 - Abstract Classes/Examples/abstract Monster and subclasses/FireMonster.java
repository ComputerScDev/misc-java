/**
* abstract Monster subclass FireMonster
*/


public class FireMonster extends Monster {
	
	/**
	* constructor
	*/
	public FireMonster(String name) {
		super(name);
	}
	
	/**
	* subclass provides actual implementation
	*/
	@Override
	public String attack() {
		return "attack with fire!";
	}
}
