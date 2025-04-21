package week1.Day3.Day3Assignments;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
		 
	}

	public static void main(String[] args) {
		Library book = new Library();
		System.out.println("The book "+book.addBook("Red Riding Hood"));
		book.issueBook();

	}

}
