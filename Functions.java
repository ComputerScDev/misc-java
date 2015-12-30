public class Functions {
	
	public static void main(String[] args) {
		int i = 1, j = 2, k = 3, m;
		X(i, j);
		System.out.println((i++) + " " + (++j));
		m = i + 2;
		k = Y(m, j);
		System.out.println(i + " " + j);
		System.out.println(Y(j, k+3));
		System.out.println(i + " " + j + " " + k);
	}
	
	public static void X(int a, int b) {
		int c = b;
		b = a;
		a = c;
	}
	
	public static int Y(int d, int e) {
		d++;
		e += 2;
		return Z(d) + Z(e);
	}
	
	public static int Z(int f) {
		return f / 2;
	}
}
