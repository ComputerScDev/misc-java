//	test 'Author' class
//	instantiates a test object of the Author model class

public class TestAuthor {
	
	public static void main(String[] args) {
		Author mark = new Author("mark n", "mark@sdentertainment.ca", "m");
		System.out.println(mark);
		mark.setEmail("mark@gmail.com");
		System.out.println(mark);
	}
}
