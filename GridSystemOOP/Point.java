public class Point {
	
	private double x, y;
	public static double z = 5;
	
	public Point() {
		x = y = 0.0;
		z = 99.9;
	}
	
	public Point(int x0, int y0) {
		x = x0;
		y = y0;
	}
	
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public void move(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public void moveto(double xNew, double yNew) {
		x = xNew;
		y = yNew;
	}
	
	public double fromOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
}