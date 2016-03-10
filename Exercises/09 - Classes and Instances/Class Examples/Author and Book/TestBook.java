// test 'Book' class
// instantiates a test object of the Book model class

public class TestBook {
	
	public static void main(String[] args) {
		Author mark = new Author("M.D.", "mark@sdentertainment.ca", "m");
		System.out.println(mark);	// toString()
		
		Book firstBook = new Book("Practical Logic (eBook)", mark, 4.99, 1000);
		System.out.println(firstBook);	// toString()
		
		Book secondBook = new Book("The Myth of Sisyphus", new Author("Albert Camus", "no@email.com", "m"), 19.99, 1000);	// anonymous instance of Author class
		System.out.println(secondBook);	// toString();
	}
}
