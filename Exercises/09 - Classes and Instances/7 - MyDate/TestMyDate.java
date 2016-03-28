//	Test class for MyDate model class

public class TestMyDate {
	
	public static void main(String[] args) {
		// MyDate d1 = new MyDate(2012, 2, 28);
		// System.out.println(d1.getUpperBound(d1.getMonth()));
		MyDate d1 = new MyDate(2012, 2, 28);
		System.out.println(d1);             // Tuesday 28 Feb 2012
		System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
		System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
		System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
		System.out.println(d1.nextYear());  // Monday 1 Apr 2013

		MyDate d2 = new MyDate(2012, 1, 2);
		System.out.println(d2);                 // Monday 2 Jan 2012
		System.out.println(d2.lastDay());   // Sunday 1 Jan 2012
		System.out.println(d2.lastDay());   // Saturday 31 Dec 2011
		System.out.println(d2.lastMonth()); // Wednesday 30 Nov 2011
		System.out.println(d2.lastYear());  // Tuesday 30 Nov 2010

		MyDate d3 = new MyDate(2012, 2, 29);
		System.out.println(d3.lastYear());  // Monday 28 Feb 2011

		// MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
		// MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
	}
}
