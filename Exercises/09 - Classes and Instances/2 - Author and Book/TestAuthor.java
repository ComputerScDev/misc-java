public class TestAuthor {
	
	public static void main(String[] args) {
		Author anAuthor = new Author("mark n.", "mark@github.com", 'm');
		System.out.println(anAuthor);
		anAuthor.setEmail("mark@sdentertainment.ca");
		System.out.println(anAuthor);
	}
	
}
