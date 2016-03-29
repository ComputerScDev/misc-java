//	Test class for 2nd Book model class

public class TestBook {
	
	public static void main(String[] args) {
		Book topologyBook = new Book("Counterexamples in Topology", 19.99, 99);
		System.out.println(topologyBook);	// toString()
		System.out.print("The authors are: \n");
		topologyBook.printAuthors();
		
		topologyBook.addAuthor(new Author("J. Arthur Seebach Jr.", "seebach@nomail.edu", 'a' ));
		topologyBook.addAuthor(new Author("Lynn Steen", "steen@nomail.edu", 'l' ));
		System.out.println(topologyBook);	// toString()
		System.out.print("The authors are: \n");
		topologyBook.printAuthors();
		
		topologyBook.removeAuthorByName("Lynn Steen");
		System.out.println(topologyBook);	// toString()
		System.out.print("The authors are: \n");
		topologyBook.printAuthors();
	}
}
