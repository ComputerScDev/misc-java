public class Line {
	
	private Point p;
	private double slope;
	
	public Line(Point p1, double s) {
		p = p1;
		slope = s;
	}
	
	public Line(Point p1, Point p2) {
		p = p2;
		slope = (p.getY() - p1.getY())/(p.getX() - p1.getX());
	}
	
	public double intercept() {
		return p.getY() - slope*p.getX();
	}
	
	public double getY(double x) {
		return slope*x + intercept();
	}
	
}