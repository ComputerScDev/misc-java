public class MyPointArray {
	
	private static MyPoint[] points = new MyPoint[10];
	
	public static void main(String[] args) {
		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < 10; i++) {
			points[i] = new MyPoint(i+1, i+1);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(points[i].toString());
		}
	}
}
