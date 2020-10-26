package service;


import java.util.ArrayList;

import author.Author;
import model.Book;

//A DB made from a list
//Contains all bird objects created in the program	
public class AuthorsDB {
	
	
	//create ArrayObject of Book objects
	private ArrayList<Book> books;
	private String dbName;
	private ArrayList<Author> authors;

	public AuthorsDB( String name) {
		this.books =  new ArrayList<Book>();
		this.authors =  new ArrayList<Author>();
		this.setDbName(name);
	}
	
	//methods
	public ArrayList<Author> getArray(){
		
		return this.authors;
	}
	public ArrayList<Author> getAuthor() {
		return authors;
	}


	public void setAuthor(ArrayList<Author> author) {
		this.authors = author;
	}


	public ArrayList<Author> getAuthorArray(){
		
		return this.authors;
	}
	public Book getBook(int location) {
		
		return this.books.get(location);
	}
	
	public int arraySize() {
		
		return this.authors.size();
	}
	
	
	public void addAuthor(Author author) {
		
		this.authors.add(author);
		//System.out.println("Array length:" + books.size() ); // Just for checking purposes
	}
	
	public void assign(Book book, String author) {	
	
		book.setAuthor(book.getAuthor() + author);
	}
	
		
	//toString
	@Override
	public String toString() {
		System.out.println (authors);
		String chain = "\rBooks list: \n";
		for (Book book : this.books) {
			chain += "\t" + book.getTitle() + ", Author: " + book.getAuthor() + ", year: " + book.getYear() + ", Publisher: " + book.getPublisher() + ", cost: " + book.getCost() + ".\n";	
			//System.out.println("Chain status: "+ chain);
		}
		return chain;

	}

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
	public ArrayList<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
}