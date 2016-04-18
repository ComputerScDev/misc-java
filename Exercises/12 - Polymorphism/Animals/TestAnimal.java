/**
* Test driver for abstract Animal superclass and its subclasses
*/

public class TestAnimal {
	
	public static void main(String[] args) {
		/**
		* using subclasses for references
		*/
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		BigDog bigDog1 = new BigDog();
		cat1.greeting();	// "nyan"
		dog1.greeting();	// "wan"
		bigDog1.greeting();	// "WAN"
		System.out.println();
		
		/**
		* using polymorphisms
		*/
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new BigDog();
		a1.greeting();	// "nyan"
		a2.greeting();	// "wan"
		a3.greeting();	// "WAN"
		System.out.println();
		//Animal a4 = new Animal();	// invalid
		
		/**
		* downcast
		*/
		Cat cat2 = (Cat)a1;
		Dog dog2 = (Dog)a2;
		Dog dog3 = (Dog)a3;
		BigDog bigDog2 = (BigDog)a3;
		dog2.greeting(dog3);	// "wan wan!"
		dog3.greeting(dog2);	// "WAN WAN"
		dog2.greeting(bigDog2);	// "wan wan!"
		bigDog2.greeting(dog2);	// "WAN WAN"
		bigDog2.greeting(bigDog1);	// "WAN WAN WAN"
	}
}
