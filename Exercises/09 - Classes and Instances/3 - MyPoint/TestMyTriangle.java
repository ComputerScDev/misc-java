public class TestMyTriangle {
	
	public static void main(String[] args) {
		MyTriangle t1 = new MyTriangle(0,0,2,3,4,0);	// isoceles
		MyTriangle t2 = new MyTriangle(0,0,4,10,8,0);	// isoceles
		MyTriangle t3 = new MyTriangle(new MyPoint(0,0),new MyPoint(1,2),new MyPoint(3,4));	// scalene
		// Print triangle properties:
		System.out.println("Three triangles:\n" + t1.toString() + "\n" + t2.toString() + "\n" + t3.toString());
		System.out.println("Respective Perimeters:\n" + t1.getPerimeter() + "\n" + t2.getPerimeter() + "\n" + t3.getPerimeter());
		System.out.println("Respective Types:\n" + t1.printType() + "\n" + t2.printType() + "\n" + t3.printType());
	}
	
}

// notice that it's impossible to get the result "equilateral" since our points must take integer values.
// proof: suppose otherwise, let (0,0), (a,b) and (c,d) be our vertices. we may assume that gcd(a,b,c,d) = 1,
// such that our triangle is unique (i.e. the lengths aren't scale multiples). If the triangle is equilateral,
// then a^2+b^2 = c^2+d^2 = (a-c)^2+(b-d)^2. 
// This implies a^2+b^2 = c^2+d^2 = a^2-2ac+c^2+b^2-2bd+d^2 = (a^2+b^2)+(c^2+d^2)-2(ac+bd)
// i.e. -(-2(ac+bd)) = 2(ac+bd) = a^2+b^2 = c^2+d^2. Hence a^2+b^2+c^2+d^2 = 4(ac+bd) = 0mod4.
// We supposed that gcd(a,b,c,d) = 1, this implies that none of the points can be even. Hence all of them must
// be odd. Given they're all odd, since for any x in a...d we must have x^2 = 1mod4, we have
// a^2+b^2+c^2+d^2 = 4mod4 = 0mod4. However, this implies there are integers x1,...,x4 = a...d such that
// a^2+b^2+c^2+d^2 = 0mod4 != 1mod4 congruent to 1 implying it's false that gcd(a,b,c,d) = 1, a contradiction.
