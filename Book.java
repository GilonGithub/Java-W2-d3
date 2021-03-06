
public class Book {

	private String title;
	private String authorFirstName;
	private String authorLastName;
	private int year;
	private double price;
	
	
	public Book(String t, String f, String l, int y, double price) {
		
		if(t == "") title = "Unknown"; else title = t;
		if(f == "") authorFirstName = "Unknown"; else authorFirstName = f;
		if(l == "") authorLastName = "Unknown"; else authorLastName = l;
		if(y <= 1900) {
			year = 1900;
		} else year = y;
		
		if(price > 0) {
			this.price = price;
		} else {
			this.price = 1;
		}
	
	}
	
	public double getTotal() {
		return this.price * 1.12;
	}
	
	public void setPrice(double price) {
		
		if(price > 0) {
			this.price = price;
		} else {
			this.price = 1;
		}
	}
	
	public void setTitle(String t) {
		if(t == "") title = "Unknown"; else title = t;
	}
	
	public void setAuthorFName(String fName) {
		if(fName == "") authorFirstName = "Unknown"; else authorFirstName = fName;
	}
	
	public void setAuthorLName(String lName) {
		if(lName == "") authorLastName = "Unknown"; else authorLastName = lName;
	}
	
	public void setYear(int y) {
		if(y <= 1900) {
			year = 1900;
		} else year = y;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthorFName() {
		return authorFirstName;
	}
	
	public String getAuthorLName() {
		return authorLastName;
	}
	
	public int getYear() {
		return year;
	}
}
