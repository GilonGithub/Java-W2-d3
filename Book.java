
public class Book {

	private String title;
	private String authorFirstName;
	private String authorLastName;
	private int year;
	
	public Book(String t, String f, String l, int y) {
		
		if(t == "") title = "Unknown"; else title = t;
		if(f == "") authorFirstName = "Unknown"; else authorFirstName = f;
		if(l == "") authorLastName = "Unknown"; else authorLastName = l;
		if(y <= 1900) {
			year = 1900;
		} else year = y;
	
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public void setAuthorFName(String fName) {
		authorFirstName = fName;
	}
	
	public void setAuthorLName(String lName) {
		authorLastName = lName;
	}
	
	public void setYear(int y) {
		year = y;
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
