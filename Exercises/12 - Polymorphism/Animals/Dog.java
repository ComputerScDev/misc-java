/**
* Dog subclass of abstract Animal superclass
*/

public class Dog extends Animal {
	
	@Override
	public void greeting() {
		System.out.println("wan");
	}
	
	public void greeting(Dog another) {
		System.out.println("wan wan!");
	}
}
