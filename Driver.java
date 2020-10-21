import java.text.DecimalFormat;

public class Driver {

	public static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void printBooks(Book[] booksArray) {
		
		for(byte i = 0; i < booksArray.length; i++) {
			System.out.println(booksArray[i].getTitle() + " " +
								booksArray[i].getAuthorFName() + " " +
								booksArray[i].getAuthorLName() + " " +
								booksArray[i].getYear() + " " +
								df.format(booksArray[i].getTotal()));
		}
	}
	
	public static void main(String[] args) {
		
		Book[] books = new Book[3];
		books[0] = new Book("", "J", "Jones", 1990, 0);
		books[1] = new Book("Second Book", "", "Jones", 1992, 2.0);
		books[2] = new Book("Third Book", "J", "Jones", 1809, 3.0);
		
		printBooks(books);
		
		System.out.println("");
		
		books[0].setTitle("Untitled");
		books[1].setAuthorFName("Anonymous");
		books[2].setPrice(10);
		
		printBooks(books);

	}

}
