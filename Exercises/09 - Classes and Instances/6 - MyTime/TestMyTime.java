//	Test method for MyTime model class

public class TestMyTime {
	
	public static void main(String[] args) {
		MyTime t1 = new MyTime(23, 59, 59);
		System.out.println("Time now: " + t1 + "\nNext second: " + t1.nextSecond() + "\n");
		
		t1 = new MyTime(23, 59, 59);
		System.out.println("Time now: " + t1 + "\nNext minute: " + t1.nextMinute() + "\n");
		
		t1 = new MyTime(23, 59, 59);
		System.out.println("Time now: " + t1 + "\nNext hour: " + t1.nextHour() + "\n");
		
		t1 = new MyTime(0, 0, 0);
		System.out.println("Time now: " + t1 + "\nLast second: " + t1.lastSecond() + "\n");
		
		t1 = new MyTime(0, 0, 0);
		System.out.println("Time now: " + t1 + "\nLast minute: " + t1.lastMinute() + "\n");
		
		t1 = new MyTime(0, 0, 0);
		System.out.println("Time now: " + t1 + "\nLast hour: " + t1.lastHour());
	}
}
