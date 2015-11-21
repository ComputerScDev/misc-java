import java.util.Scanner;

class fastExponentiation {
	
	public static int x,y,z;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		x = in.nextInt(); y = in.nextInt();
		z = 1;
		B();
		System.out.print(z);
	}
	
	public static void B() {
		if (y%2 == 0) {
			C();
		} else {
			D();
		}
	}
	
	public static void C() {
		if (y=0);
		else {
			E();
		}
	}
	
	public static void D() {
		z = z*x;
		y--;
		C();
	}
	
	public static void E() {
		x*=x;
		y/=2;
		F();
	}
	
	public static void F() {
		if (y%2==0) {
			E();
		} else {
			D();
		}
	}
	
}

/* Given rational variables x,z and natural variable, write a program 
for z' = x^y that runs fast without using exponentiation. */
