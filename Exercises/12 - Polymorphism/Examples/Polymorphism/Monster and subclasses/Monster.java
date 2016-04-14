/**
* Polymorphism continued:
* superclass defines the expected behaviors (public interface) of all its subclasses,
* (programming at the public interface level). subclasses provide the actual implementation.
* 
* Monster superclass - defines the expected common behaviors
*/


public class Monster {
	
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
	public String attack() {
		return "i don't know how to attack!";	//	we need to return a string, else compilation error
	}
}
