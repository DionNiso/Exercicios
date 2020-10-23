package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Author;
import model.Book;
import service.BooksDB;
import services.AuthorsDB;
import utils.UtilsIO;
import view.Menu;
import view.MenuOptions;

public class Controller {
	
	//static FrontController methods
	public static void add(Scanner reader, BooksDB db, ArrayList<Author> author) {  
		//Ask for input data
		
		//ArrayList<Author> list = new ArrayList<Author>();
		ArrayList<Book> books = new ArrayList<Book>();
		ArrayList<Author> authors = new ArrayList<Author>();
		
		System.out.println("list of authors" + authors);
		
		String title = UtilsIO.askForTitle(reader);
		//String author = UtilsIO.askForAuthor(reader);
		int year = UtilsIO.askForYear(reader);
		String publisher = UtilsIO.askForPublisher(reader);
		int cost = UtilsIO.askForCost(reader);
				
		//Create object Author
		//Author author1 = new Author(author);
		//Create object Book
		//Book book = new Book(title, Author, 0, publisher, cost);
		
		books.add(new Book(title, authors.get(1), year, publisher, cost));
		
		//System.out.println("lo que acabo de crear" + book);
		//System.out.println("lo que hay en la db" + db);
		
		//Ask if book is in BookDB
		/*if (isBookInDb(book, db)) {
			db.addBook(book);
		}*/
	}
			
	/*public static void observation(Scanner reader, BooksDB db) {
		//adds observation to book
		//get the book
		String name = UtilsIO.askForTitle(reader);
		
		
		int location = isBookInDb( title, db );
		//System.out.println("location: "+location); // Just for checking purposes
		if (location  != -1) {
			//true add observation
			int observations = UtilsIO.askObservation(reader);
			db.getBook(location).addObservation(observations);
		}
		else {
		//false prompt a message
			UtilsIO.noBookMessage(title);
		}
	}*/
	
	
	public static void show(Scanner reader, BooksDB db) { 
		//shows single book data
		
		//get the book
		////ask the user
		String name = UtilsIO.askForTitle( reader );
		////check if book exists
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
		//Ask if book is in BookDB
		for( Book dbBook : db.getArray()) {
			//System.out.println("book object name: "+book.getTitle());
			//System.out.println("dbBook object name: "+dbBook.getTitle());
			if( book.getTitle().equals(dbBook.getTitle())) {
				
				return false;
				}			
		}

		//If not add book to BookDB
		return true;
	}
	
	public static int isBookInDb(String name, BooksDB db) {		
		//Ask if book is in BookDB
		int i = 0;
		for( Book dbBook : db.getArray()) {
			if(name.equals(dbBook.getTitle())) {
				return i;
			}
			i ++;
		}		
		//If not add book to BookDB
		return -1;        System.out.println("See you in the sky!");
    }    

    public static void start(){
        //to-do
}

    public static void createBook(){
        //to-do
}

    public static void assign(){
        
    	public int askForAuthorPosition(AuthorsDB authorsDB) {
    		System.out.print("\nWhich number of author you want to assign this book/s? ");

    		while (true) {
    			String auxNumberOfAuthor = reader.nextLine();

    			if (auxNumberOfAuthor.matches("[0-9]+")) {
    				int numberOfAuthor = Integer.valueOf(auxNumberOfAuthor);

    				if (0 <= numberOfAuthor && numberOfAuthor < authorsDB.getAuthorsList().size()) {
    					return numberOfAuthor;
    				}
    			}

    			System.out.print("Please, enter a number between 0 and " + (authorsDB.getAuthorsList().size() - 1)
    					+ " (both included): ");
    		}
    	}

}


}
	}
}