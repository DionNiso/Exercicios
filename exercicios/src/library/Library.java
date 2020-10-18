package library;

import java.util.ArrayList;

public class Library {
	
		//public ArrayList<Book> books = new ArrayList<Book>();
	
		public ArrayList<Book> books;
		
		public Library() {
			this.books = new ArrayList<Book>();
		}
		
		public void addBook(Book book) {
			this.books.add(book);
		}
	
		public void printBooks() {
			for (Book book: this.books){
				System.out.println(book);
			}
		}
		
		public  ArrayList<Book> searchByTitle(String title){
			return searchBook (title, null, -1);
		}
		
		public  ArrayList<Book> searchByAuthor(String author){
			return searchBook (null, author, -1);
		}
		
		public   ArrayList<Book> searchByYear(int publishingYear){
			return searchBook (null, null, publishingYear);
		}
		
		public ArrayList<Book> searchBook (String title, String author, int publishingYear){
				ArrayList<Book> found = new ArrayList<Book>();
					for (Book book : this.books) {
						if (StringUtils.included(book.Title(), title) ||
							StringUtils.included(book.Author(), author)||
							book.publishingYear() == publishingYear) {
							found.add(book);
						}
		
					}
					return found;
		}
		
}