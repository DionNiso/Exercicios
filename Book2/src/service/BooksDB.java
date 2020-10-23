package service;


import java.util.ArrayList;

import model.Author;
import model.Book;

//A DB made from a list
//Contains all bird objects created in the program	
public class BooksDB {
	
	
	//create ArrayObject of Bird objects
	private ArrayList<Book> books;
	private String dbName;
	private ArrayList<Author> author;

	public BooksDB( String name) {
		this.books =  new ArrayList<Book>();
		this.author =  new ArrayList<Author>();
		this.setDbName(name);
	}
	
	
	public ArrayList<Author> getAuthor() {
		return author;
	}


	public void setAuthor(ArrayList<Author> author) {
		this.author = author;
	}


	//methods
	public ArrayList<Book> getArray(){
		
		return this.books;
	}
	
	public Book getBook(int location) {
		
		return this.books.get(location);
	}
	
	public int arraySize() {
		
		return this.books.size();
	}
	
	////add book
	public void addBook(Book book) {
		
		this.books.add(book);
		//System.out.println("Array length:" + books.size() ); // Just for checking purposes
	}
	
	////dropBook
	public void deleteBook(Book book) {
		
		//this.books.remove(this.books.indexOf(book));
		this.books.remove(book);
	}
	/*
	////addObservation
	public void addObservation(Book bird, int observations) {	
	
		book.setObservations(bird.getObservations() + observations);
	}*/
	
	////showBook
	public void showBook(Book book) {
		
		book.toString();
	}
		
	
	//toString
	@Override
	public String toString() {
		System.out.println (books);
		String chain = "\rBooks list: \n";
		for (Book book : this.books) {
			chain += "\t" + book.getTitle() + ", " + "author: " +  book.getAuthor() + ", year: "+ book.getYear() + ", Publisher: "+ book.getPublisher() + ", cost: "+ book.getCost() + "$"+".\n";	
			//System.out.println("Chain status: "+ chain);
		}
		return chain;

	}
/*author;
    private int year;
    private String publisher;
    private  double cost*/

	public ArrayList<Book> getBooks() {
		return books;
	}


	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}