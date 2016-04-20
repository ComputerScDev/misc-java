/**
* Testing the static keyword
*/

public class Circle {
	
	public int count = 0;	// counts number of instances created
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		++count;
	}
}
