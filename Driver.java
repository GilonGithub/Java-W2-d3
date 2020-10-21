
public class Driver {

	public static void printBooks(Book[] booksArray) {
		
		for(byte i = 0; i < booksArray.length; i++) {
			System.out.println(booksArray[i].getTitle() + " " +
								booksArray[i].getAuthorFName() + " " +
								booksArray[i].getAuthorLName() + " " +
								booksArray[i].getYear());
		}
	}
	
	public static void main(String[] args) {
		
		Book[] books = new Book[3];
		books[0] = new Book("", "J", "Jones", 1990);
		books[1] = new Book("Second Book", "", "Jones", 1992);
		books[2] = new Book("Third Book", "J", "Jones", 1809);
		
		printBooks(books);
		
		System.out.println("");
		
		books[0].setTitle("Untitled");
		books[1].setAuthorFName("Anonymous");
		
		printBooks(books);

	}

}
