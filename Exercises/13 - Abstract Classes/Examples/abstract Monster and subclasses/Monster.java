/**
* abstract superclass Monster
* defines expected common behaviors of instantiated Monster subclass objects
* via abstract methods
*/

abstract public class Monster {
	
	/**
	* private instance variable
	*/
	private String name;
	
	/**
	* constructor
	*/
	public Monster(String name) {
		this.name = name;
	}
	
	/**
	* define common behavior for all subclasses
	*/
	abstract public String attack();
}
