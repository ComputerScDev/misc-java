/**
* Test class
* IMPORTANT: this is where we see substitutability, notice...
*/

public class TestCircle {
	
	public static void main(String[] args) {
		Circle c1 = new Cylinder(1.1, 2.2);	* we substitute a subclass instance to its superclass reference
		System.out.println("circle #1 properties:\n"
		+ "radius = " + c1.getRadius() + "\n"
		+ c1.toString() + "\n");
		/**
		* c1, despite being a circle, internally holds a cylinder object
		* so here we invoke the overridden cylinder version of toString()
		*/
		//System.out.println(c1.getHeight());	* compilation error
		//System.out.println(c1.getVolume());	* compilation error
		
		/**
		* compilation errors since c1 is a reference to a Circle class object, 
		* however it's using a Cylinder subclass instance as a reference
		*/
		System.out.println(c1.getArea());	* here we run the overriden version 
		/**
		* in general: instantiated objects obey overriden methods 
		* of subclasses despite acting as superclass references
		*/
	}
}
