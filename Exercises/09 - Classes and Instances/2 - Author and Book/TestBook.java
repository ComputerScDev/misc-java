public class TestBook {
	
	public static void main(String[] args) {
		Author anAuthor = new Author("mark", "mark@sdentertainment.ca", 'm');
		Book aBook = new Book("Practical Logic", anAuthor, 19.95, 1000);
		// Use an anonymous instance of Author class
		Book anotherBook = new Book("More Practical Logic", new Author("mark n.", "mark@sdentertainment", 'm'), 29.95, 1000);
		System.out.println(aBook.toString());
		System.out.println(anotherBook.toString());
		// Try: print the name and email of author from a Book instance
		System.out.println("Test #1:\n" + aBook.getName() +" author name: " + aBook.getAuthor().getName() + "\n" + aBook.getName() + " author email: " + aBook.getAuthor().getEmail());
		// Use the new methods: getAuthorName, getAuthorEmail, getAuthorGender
		System.out.println("Test #2:\n" + aBook.getName() +" properties;\nauthor name: " + aBook.getAuthorName() + "\nauthor email: " + aBook.getAuthorEmail() + "\nauthor gender: " + aBook.getAuthorGender());
	}
	
}
