//	inheritance subexercise
//	Test class for LineSub subclass of Point model class

public class TestLineSub {
	public static void main(String[] args) {
		System.out.println("First test trial:");
		LineSub line1 = new LineSub(1, 0, 0, 1);
		System.out.println(line1 + "\n" + "line length: " + line1.getLength() + "\nline argument: " + line1.getArgument() + "\nin degrees: " + line1.getArgDeg() + "\n");
		line1.setBeginXY(0, 0);	// change first pt
		line1.setEndXY(1, 0);	// change second pt
		System.out.println("line changes complete:\n" + line1 + "\n" + "line length: " + line1.getLength() + "\nline argument: " + line1.getArgument() + "\nin degrees: " + line1.getArgDeg() + "\n");
		System.out.println("Second test trial:");
		Point p1 = new Point(1, 0);
		Point p2 = new Point(0, 1);
		LineSub line2 = new LineSub(p1, p2);
		System.out.println(line2 + "\n" + "line length: " + line2.getLength() + "\nline argument: " + line2.getArgument() + "\nin degrees: " + line2.getArgDeg() + "\n");
		line2.setBegin(new Point(0, 1));	// set first pt
		line2.setEnd(new Point(-1, -1));	// set end pt
		System.out.println("line changes complete:\n" + line2 + "\n" + "line length: " + line2.getLength() + "\nline argument: " + line2.getArgument() + "\nin degrees: " + line2.getArgDeg() + "\n");
	}
}
