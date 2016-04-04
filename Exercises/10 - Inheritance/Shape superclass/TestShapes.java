//	Test class for Shape superclass and its subclasses (Circle, Rectangle, Square)

public class TestShapes {
	
	public static void main(String[] args) {
		
		Shape sh = new Shape();
		System.out.println(sh);
		System.out.println("shape colour: " + sh.getColour());
		System.out.println("fill status: " + sh.isFilled());
		sh.setColour("purple");
		sh.setFilled(false);
		System.out.println(sh + "\n");
		
		Circle c1 = new Circle();
		System.out.println(c1);
		System.out.println("circle colour: " + c1.getColour());
		System.out.println("fill status: " + c1.isFilled());
		System.out.println("perimeter: " + c1.getPerimeter());
		System.out.println("area: " + c1.getArea() + "\n");
		
		
		// Shape c2 = new Circle(5.5, "red", false);
		Circle c2 = new Circle(5.5, "red", false);
		System.out.println(c2);
		System.out.println("circle colour: " + c2.getColour());
		System.out.println("fill status: " + c2.isFilled());
		System.out.println("perimeter: " + c2.getPerimeter());	// comment this if switching to Shape constructor
		System.out.println("area: " + c2.getArea() + "\n");
		
		// Circle c3 = (Circle)c1;
		// System.out.println(c3);
		// System.out.println("circle colour: " + c3.getColour());
		// System.out.println("fill status: " + c3.isFilled());
		// System.out.println("perimeter: " + c3.getPerimeter());
		// System.out.println("area: " + c3.getArea() + "\n");
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		System.out.println("rectangle colour: " + r1.getColour());
		System.out.println("fill status: " + r1.isFilled());
		System.out.println("perimeter: " + r1.getPerimeter());
		System.out.println("area: " + r1.getArea() + "\n");
		
		Rectangle r2 = new Rectangle(10, 10, "green", true);
		System.out.println(r2);
		System.out.println("rectangle colour: " + r2.getColour());
		System.out.println("fill status: " + r2.isFilled());
		System.out.println("perimeter: " + r2.getPerimeter());
		System.out.println("area: " + r2.getArea() + "\n");
		
		Square s1 = new Square(10);
		System.out.println(s1);
		System.out.println("square colour: " + s1.getColour());
		System.out.println("fill status: " + s1.isFilled());
		System.out.println("side value: " + s1.getSide());
		System.out.println("area: " + s1.getArea() + "\n");
		
		Square s2 = new Square(20, "blue", true);
		System.out.println(s2);
		System.out.println("square colour: " + s2.getColour());
		System.out.println("fill status: " + s2.isFilled());
		System.out.println("side value: " + s2.getSide());
		System.out.println("area: " + s2.getArea() + "\n");
	}	
}
