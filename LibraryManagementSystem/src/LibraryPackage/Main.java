package LibraryPackage;


public class Main {
	/*
	 * Main Class (Driver) 
• Handles user interaction and runs the program. 
• Demonstrates: 
o Adding books to the library. 
o Displaying available books. 
o Borrowing and returning books. 
o Searching for books. 
	 */
public static void main(String[] args) {
	
	
	Library mnLib = new Library();
	
	Member cal = new Member();
	Member prath = new Member();
	
	Book A01 = new Book("1984", "George orwell");
	Book A02 = new Book("The Odosey", "Homer");
	Book A03 = new Book("Meditations", "Marcus Aurelius");
	
	mnLib.addBook(A01);
	mnLib.addBook(A02);
	mnLib.addBook(A03);
	

 	cal.borrowBook(mnLib, "The Odosey");
 	// testing edge cases: we don't have any book named The Odissi, simulating a typo
 	cal.borrowBook(mnLib, "The Odissi");
	cal.returnBook(mnLib, "The Odissi");
	cal.returnBook(mnLib, "The Odosey");
	cal.borrowBook(mnLib, "The Odosey");
	
	// when another member tries to borrow a book that was already borrowed:
	prath.borrowBook(mnLib, "The Odosey"); // throws the unavailable error
	
	
	
}
}
