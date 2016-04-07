//	Test class for LineSub subclass of Line model class (Inheritance example)

public class TestLineSub {

	public static void main(String[] args) {
		System.out.println("First test trial:");
		LineSub line1 = new LineSub(1, 0, 0, 1);
		System.out.println(line1 + "\n" + "line length: " + line1.getLength() + "\n");
		line1.setBeginXY(2, 0);	// change first pt
		line1.setEndXY(0, 2);	// change second pt
		System.out.println("line changes complete:\n" + line1 + "\n" + "line length: " + line1.getLength() + "\n");
		System.out.println("Second test trial:");
		Point p1 = new Point(1, 0);
		Point p2 = new Point(0, 1);
		LineSub line2 = new LineSub(p1, p2);
		System.out.println(line2 + "\n" + "line length: " + line2.getLength() + "\n");
		line2.setBegin(new Point(2, 0));	// set first pt to (2, 0)
		line2.setEnd(new Point(0, 2));	// set end pt to (0, 2)
		System.out.println("line changes complete:\n" + line2 + "\n" + "line length: " + line2.getLength() + "\n");
	}
}
