package in.cdac.books;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		String authName, authEmail;
		char authGender;
		Scanner userIn = new Scanner(System.in);
		// getting Author info
		System.out.print("AUTHOR NAME > ");
		authName = userIn.nextLine();
		System.out.print("AUTHOR EMAIL > ");
		authEmail = userIn.nextLine();
		System.out.print("AUTHOR GENDER > ");
		authGender = userIn.nextLine().charAt(0);
	
		// creating instance
		Author author = new Author(authName, authEmail, authGender);
		Book book = new Book("Book", author, 100.0, 1);
		
		System.out.println(book);
		// updating book price
		book.setBookPrice(45.00);
		
		System.out.println(book);
		userIn.close();
	}

}
