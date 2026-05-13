package classwork_6;

public class Book {
	String title;
	String author;
	int year;
	private boolean isAvailable = true;
	public void borrow() {
	if(isAvailable = false)	{
		System.out.println("Kniga vidana" + title);
	}
	else {System.out.println("Kniga zanata");}
	
	
	public void returnBook() {
		System.out.println("Kniga" + title + "vozvrasena");
	}
	
		
	}

}
