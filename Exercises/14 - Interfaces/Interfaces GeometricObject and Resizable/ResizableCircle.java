/**
* ResizableCircle extends Circle and implements Resizable
*/

public class ResizableCircle extends Circle implements Resizable {
	
	/**
	* constructor
	*/
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public double resize(int percent) {
		radius *= (percent * 0.01);
		return radius;
	}
}
