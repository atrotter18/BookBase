package model;

import java.util.Random;

public class BookBase {
	private int bookId;
	private String title;
	private boolean checkedOut;
	
	private static final String[] RANDOM_TITLES = {
	        "The Great Gatsby",
	        "To Kill a Mockingbird",
	        "1984",
	        "Pride and Prejudice",
	        "The Catcher in the Rye",
	        "The Hobbit",
	        "The Lord of the Rings",
	        "Harry Potter and the Sorcerer's Stone",
	        "War and Peace",
	        "Moby-Dick"
	    };
	
	public BookBase() {
		super();
	}
	
	public BookBase(int bookId) {
		super();
		this.bookId = bookId;
		this.checkedOut = false;
		setId(bookId);
	}
	
	public void randomTitle() {
        Random random = new Random();
        int randomIndex = random.nextInt(RANDOM_TITLES.length);
        this.title = RANDOM_TITLES[randomIndex];
    }

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
		setId(bookId);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	public void checkOut() {
		checkedOut = true;
	}
	
	public void checkIn() {
		checkedOut = false;
	}
	
	public void setId(int bookId) {
	    this.bookId = bookId;
	    if (bookId % 2 == 0) {
	        this.checkedOut = false;
	        System.out.println("Checked In");
	    } else {
	        this.checkedOut = true;
	        System.out.println("Checked Out");
	    }
	}
	
	@Override
	public String toString() {
		String status = checkedOut ? "Checked Out" : "Checked In";
		return "Book ID: " + bookId + "\nTitle: " + "\nStatus: " + status;
	}
	
}
