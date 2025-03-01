package LibraryPackage;


public class Member {
	/*
	 * Member Class 
• Methods: 
o borrowBook(Library library, String title) 
o returnBook(Library library, String title)
	 */
	public void borrowBook(Library library, String title) {
		 Book book = library.searchBook(title);
		 if (!(book == null)) {
			 book.borrowBook();

		 }
	}
	 
	public void returnBook(Library library, String title) {
		 Book book = library.searchBook(title);
		 if (!(book == null)) {
		 book.returnBook();
		 }
	 }
}
