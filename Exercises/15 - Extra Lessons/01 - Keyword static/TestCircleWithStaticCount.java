/**
* Testing the static keyword
*/

public class TestCircleWithStaticCount {
	
	public static void main(String[] args) {
		CircleWithStaticCount c1 = new CircleWithStaticCount(1.1);
		System.out.println(c1.count);	// 1
		System.out.println(CircleWithStaticCount.count);	// we can access static variable via classname too
		CircleWithStaticCount c2 = new CircleWithStaticCount(2.2);
		System.out.println(c1.count);	// 2
		System.out.println(c2.count);	// 2
		System.out.println(CircleWithStaticCount.count);	// 2
		CircleWithStaticCount c3 = new CircleWithStaticCount(3.3);
		System.out.println(c1.count);	// 3
		System.out.println(c2.count);	// 3
		System.out.println(c3.count);	// 3
		System.out.println(CircleWithStaticCount.count);	// 3
	}
	/**
	* expected output:
	* 1
	* 1
	* 2
	* 2
	* 2
	* 3
	* 3
	* 3
	* 3
	*/
}
