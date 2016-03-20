public class MyPointArray {
	
	private static MyPoint[] points = new MyPoint[10];
	
	public static void main(String[] args) {
		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < 10; i++) {
			points[i] = new MyPoint(i, i);
		}
		System.out.println(pointArray());
	}
	
	private static String pointArray() {
		String output = "";
		for (int i = 0; i < 10; i++) {
			output += points[i].toString() + " ";
		}
		return output;
	}
	
}
