/** 
* Test driver for Point3D subclass of Point2D superclass
*/

public class TestPoint3D {
	
	public static void main(String[] args) {
		Point3D threeDOrigin = new Point3D();
		Point3D newPoint = new Point3D(1.0f, 1.0f, 1.0f);
		System.out.println(threeDOrigin + "\n" + newPoint + "\n");
		System.out.println(helper(threeDOrigin.getXYZ()));
		System.out.println(helper(newPoint.getXYZ()) + "\n");
		threeDOrigin.setXYZ(1.0f, 1.0f, 1.0f);
		newPoint.setXYZ(0.0f, 0.0f, 0.0f);
		System.out.println(threeDOrigin + "\n" + newPoint + "\n");
		System.out.println(helper(threeDOrigin.getXYZ()));
		System.out.println(helper(newPoint.getXYZ()));
	}
	
	public static String helper(float[] input) {
		int i = 0;
		String newString = "";
		while (i != 3) {
			newString += input[i];
			i++;
			if (i < 3) {
				newString += " ";
			}
		}
		return newString;
	}
}
