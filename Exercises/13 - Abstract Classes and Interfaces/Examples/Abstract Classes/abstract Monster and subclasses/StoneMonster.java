/**
* abstract Monster subclass Watermonster
*/

public class StoneMonster extends Monster {
	
	/**
	* constructor
	*/
	public StoneMonster(String name) {
		super(name);
	}
	
	/**
	* subclass provides actual implementation
	*/
	@Override
	public String attack() {
		return "attack with stone!";
	}
}
