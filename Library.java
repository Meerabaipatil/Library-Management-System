package LMS;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> books = new ArrayList<Book>();
	List<User> users = new ArrayList<User>();

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book " + book.getTitle() + " Added Successfully to the Library");
		return;

	}

	public void addUser(User user) {
		users.add(user);
		System.out.println("The User " + user.getName() + " added to library");
		return;
	}

	public void showUsers(User user) {
		for (User u : users) {
			System.out.println(u);
		}
	}

	public void showBooks() {
		System.out.println("The list of Books are:");
		for (Book b : books) {
			System.out.println(b);
		}
	}

	public void issueBook(String title, int userId) {

		for (Book book : books) {

			if (book.getTitle() == title && !book.isIssued()) {
				book.issue();
				System.out.println("Book issued successfully.");
				return;
			
			}
			 		}
		System.out.println("Book not available or already issued.");

	}

	public void returnBook(String title, int userId) {
		for (Book book3 : books) {

			if (book3 == null) {
				System.out.println("Book Not found");
				return;
			}

			if (!book3.isIssued()) {
				System.out.println("Book " + book3.getTitle() + "  Not issued Yet.");
				return;
			}
			if (book3.isIssued()) {
				book3.returnBook();
				System.out.println("user" + userId + "returned " + book3.getTitle() + "book.");
				return;
			}
			if (book3.getTitle().equalsIgnoreCase(title)) {
				book3.returnBook();
				System.out.println("user" + userId + "returned " + book3.getTitle() + "book.");
				return;
			}
		}
		return;
	}

}
