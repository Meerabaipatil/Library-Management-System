package LMS;

public class Book {
	private int bookId;
	private String title;
	private boolean isIssued;
	
	

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void issue() {
		isIssued = true;
	}

	public void returnBook() {
		isIssued = false;
	}

	public Book(int bookId, String title) {
		super();
		this.bookId = bookId;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + "]";
	}

	
	

	
}
