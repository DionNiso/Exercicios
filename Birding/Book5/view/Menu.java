package view;

import java.util.Scanner;

import author.Author;
import controller.Controller;
import service.BooksDB;
import utils.UtilsIO;

import java.util.ArrayList;
//import java.util.Collections;

public class Menu {		
	private Scanner reader;
	private BooksDB db;
//	private Menu menu;
	
	
	public Menu(Scanner reader, BooksDB db) {
		this.reader = reader;
		this.db = db;
		//this.menu = menu;
	}
		
	public  void loop(Scanner reader, ArrayList<Author> author) {	
		MenuOptions options = new MenuOptions();
		
	    while (true) {
	    	
	    	options.showMenu();
	        String command = UtilsIO.ask(this.reader, "Option?");
	        
		        try {
		        	options.getOption(command);	        	
		        } catch (Exception e) {
		        	System.out.println("Unknown command!");
		        }
	
	        if (command.equals("Quit")) {
	            break;
	        } else if (command.equals("Add")) {
	        	Controller.add(this.reader,db, author);
	        } /*else if (command.equals("Observation")) {
	        	Controller.observation(this.reader,db);
	        }*/ else if (command.equals("Show")) {
	        	Controller.show(this.reader,db);
	        } else if (command.equals("Statistics")) {
	        	Controller.statistics(db);
	        } else if (command.equals("Menu")) {
	        	Controller.menu(options);
	        }
	    }
	}

}