//	composition exercise
//	"a line is composed of two points"
//	Test class for Point model class

public class TestPoint {
	
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		System.out.println("first state" + p1);
		//	change point object properties
		p1.setXY(2, 1);
		System.out.println("second state" + p1);
	}	
}
