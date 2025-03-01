package LibraryPackage;

import java.util.ArrayList;

public class Library {

	ArrayList<Book> booksArray = new ArrayList<>();

	public Library() {

	}

	public void addBook(Book book) {
		booksArray.add(book);
		System.out.println("The book was successfully added");
	}

	public void removeBook(String title) {
		for (int i = 0; i < booksArray.size(); i++) {
			System.out.println(booksArray.get(i).toString());
			if (booksArray.get(i).title == title) {
				booksArray.remove(i);
				System.out.println("The book was removed successfully");
			}
		}
	}

	public Book searchBook(String title) {
		Book currentBook = null;
		for (int i = 0; i < booksArray.size(); i++) {
			if (booksArray.get(i).title == title) {
				System.out.println("Book was found");
				currentBook = booksArray.get(i);
				return currentBook;
			}
		}
		System.out.println("Book was NOT found");
		return null;
	}
	
	public void displayBooks () {
		System.out.println("These are the available books:");
		for (int i = 0; i < booksArray.size(); i++) {
			System.out.println(booksArray.get(i).toString());

		}
		System.out.println("");

	}

}
