/**
* Testing the static keyword
*/

public class CircleWithStaticCount {
	
	public static int count = 0;	// static variable to count # of instances created, shared by all instances
	private double radius;	// instance variable for each circle to maintain own radius
	
	public CircleWithStaticCount(double radius) {
		this.radius = radius;
		++count;
	}
}
