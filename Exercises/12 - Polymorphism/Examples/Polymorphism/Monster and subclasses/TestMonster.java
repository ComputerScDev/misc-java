/** Polymorphism continued:
superclass defines the expected behaviors (public interface) of all its subclasses,
(programming at the public interface level).
subclasses provide the actual implementation.
*/

//	Test driver for Monster superclass

public class TestMonster {
	
	public static void main(String[] args) {
		//	program at the "interface" defined in superclass
		//	declare instances of the superclass, substituted by its subclasses
		Monster m1 = new FireMonster("Charmander");	// upcast
		Monster m2 = new WaterMonster("Squirtle");	// upcast
		Monster m3 = new StoneMonster("Geodude");	// upcast
		
		//	invoke actual implementation
		System.out.println(m1.attack());	// run FireMonster's attack()
		System.out.println(m2.attack());	// run WaterMonster's attack()
		System.out.println(m3.attack());	// run StoneMonster's attack()
		
		//	m1 dies, generate a new instance and re-assign to m1
		m1 = new StoneMonster("Onyx");	// upcast
		System.out.println(m1.attack());	// run StoneMonster's attack()
		
		//	problem!
		Monster m4 = new Monster("Ditto");
		System.out.println(m4.attack());	// error
	}
}
