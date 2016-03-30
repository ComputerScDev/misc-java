//	Test class for Ball model class

public class TestBall {
	
	public static void main(String[] args) {
		Ball ball = new Ball(1, 1, 2, 10, 20);
		
		System.out.println("initial x co-ordinate: " + ball.getX());
		System.out.println("initial y co-ordinate: " + ball.getY());
		System.out.println("initial radius: " + ball.getRadius());
		System.out.println("initial ball state: " + ball + "\n");
		
		ball.setX(5);
		ball.setY(5);
		ball.setRadius(20);
		System.out.println("second ball state: " + ball + "\n");
		
		ball.setXY(100, 100);
		System.out.println("third ball state: " + ball + "\n");
		
		ball.move();
		System.out.println("move ball \nfourth ball state: " + ball + "\n");
		
		ball.reflectHorizontal();
		ball.move();
		System.out.println("horizontal reflection\nfifth ball state: " + ball + "\n");
		
		ball.reflectVertical();
		ball.move();
		System.out.println("vertical reflection\nfinal ball state: " + ball + "\n");
	}
}
