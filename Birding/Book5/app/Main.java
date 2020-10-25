package app;

import java.util.Scanner;

import service.BooksDB;
import utils.InitialBooksFilling;
import view.Menu;

public class Main {

	public static void main(String[] args) {
		// Watching up books!
		
		
		BooksDB db = new BooksDB( "birding" );
		
		db.setBooks(InitialBooksFilling.books);
		
		//Ask user from menu by scanner
		Scanner reader = new Scanner(System.in);
		
		Menu menu = new Menu(reader, db );
		menu.loop(reader, null);
		
		System.out.println("See you!");
	}	

}

