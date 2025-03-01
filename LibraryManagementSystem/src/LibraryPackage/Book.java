package LibraryPackage;

public class Book {
	/*
	 * Book Class • Attributes: title, author, isAvailable • Methods: o borrowBook()
	 * o returnBook() o toString()
	 */
	String title;
	private String author;
	private boolean isAvailable;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	public void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("this book is now being borrowed");
		}
		else {
			System.out.println("This book is unavailble:(");
		}

	}

	public void returnBook() {
		if (isAvailable) {
			System.out.println("this book is already returned");
		}
		else {
			System.out.println("This book is now returned");
			isAvailable = true;
		}

	}

	public String toString() {
		return title + " by " + author + " availabilty: " + isAvailable;

	}
}
