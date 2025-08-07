package LMS;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);

		lib.addBook(new Book(1, "Java"));
		lib.addBook(new Book(2, "Python"));
		lib.addBook(new Book(3, "SQL"));
		lib.addBook(new Book(4, "DSA"));

		lib.addUser(new User(101, "Meera"));
		lib.addUser(new User(102, "Nitya"));
		lib.addUser(new User(103, "Om"));
		lib.addUser(new User(104, "Vishnu"));

		while (true) {
			System.out.println("-- Library Menu --");
			System.out.println("1. Show all books");
			System.out.println("2. Issue a book");
			System.out.println("3. Return a book");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				lib.showBooks();
				break;

			case 2:
				System.out.println("Enter book title to issue");
				String bookTitle = sc.next();
				lib.issueBook("Java", 101);
				break;
				
			case 3:
				System.out.println("Enter book id to return");
				int bookId=sc.nextInt();
				lib.returnBook("Python", 101);
				break;
				
			case 4:
				break;
				default:
					System.out.println("Invalid input");
					break;
			}
			
			
		
		}
	}
}
