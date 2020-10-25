package controller;

import java.util.ArrayList;
import java.util.Scanner;

import author.Author;
import model.Book;
import service.BooksDB;
import utils.UtilsIO;
//import view.Menu;
import view.MenuOptions;

public class Controller {
	
	//static FrontController methods
	public static void add(Scanner reader, BooksDB db, ArrayList<Author> author) {  
		//Ask for input data
	
		String title = UtilsIO.askForTitle(reader);
		int year = UtilsIO.askForYear(reader);
		String publisher = UtilsIO.askForPublisher(reader);
		int cost = UtilsIO.askForCost(reader); 
		
		String authorName = UtilsIO.askForAuthorName(reader);
		String email = UtilsIO.askForEmail(reader);
		char gender = UtilsIO.askForGender(reader);
				
		//Create object Author
		Author personAuthor = new Author(authorName, email, gender);
				
		//Create object Book
		Book book = new Book(title, personAuthor.getName(), year, publisher, cost);
		
		//System.out.println("lo que acabo de crear" + book);
		//System.out.println("lo que hay en la db" + db);
		
		//Ask if book is in BooksDB
		
		if (isBookInDb(book, db)) {
			db.addBook(book);
		}
	}
			
	/*public static void observation(Scanner reader, BooksDB db) {
		//get the book
		String name = UtilsIO.askForTitle(reader);
		
		//ask if bird is on the wire (Leonard Cohen)
		int location = isBookInDb( name, db );
		//System.out.println("location: "+location); // Just for checking purposes
		if (location  != -1) {
			//true add observation
			int observations = UtilsIO.askObservation(reader);
			db.getBook(location).addObservation(observations);
		}
		else {
		//false prompt a message
			UtilsIO.noBookMessage(name);
		}
	}*/
	
	public static void show(Scanner reader, BooksDB db) { 
		//shows single book data
		
		//get the book
		////ask the user
		String name = UtilsIO.askForTitle( reader );
		////check if bird exists
		int location = isBookInDb(name, db);
		
	
		//Print the data
		if (location != -1) {
		//////true print the book data
			System.out.println(db.getBook(location)); //Prints book data by default as defined in toString
		}
		else {
			//////false prompt a message 
			UtilsIO.noBookMessage(name);
		}
	}
	
	public static void statistics(BooksDB db) { 
		//Print the complete DB
		System.out.println(db.toString());
		
	}
	public static void menu(MenuOptions options) { 
		//Print the complete DB
		System.out.println("These are the available options");
		//System.out.println(options.toString());
		
	}
	
	//static Controller methods
	public static boolean isBookInDb(Book book, BooksDB db) {	
		//Check for empty array
		if (db.arraySize() == 0 ){
			return true;
		}
		//Ask if bird is in BooksDB
		for( Book dbBook : db.getArray()) {
			//System.out.println("book object name: "+book.getName());
			//System.out.println("dbBook object name: "+dbBook.getName());
			if( book.getTitle().equals(dbBook.getTitle())) {
				
				return false;
				}			
		}

		//If not add book to BooksDB
		return true;
	}
	
	public static int isBookInDb(String name, BooksDB db) {		
		//Ask if book is in BooksDB
		int i = 0;
		for( Book dbBook : db.getArray()) {
			if(name.equals(dbBook.getTitle())) {
				return i;
			}
			i ++;
		}		
		//If not add book to BooksDB
		return -1;
	}
}
