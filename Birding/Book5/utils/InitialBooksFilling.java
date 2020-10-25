package utils;

import java.util.ArrayList;

import author.Author;
import model.Book;

public class InitialBooksFilling {
	
		public static ArrayList<Book> books = new ArrayList<Book>();
		public static ArrayList<Author> authors = new ArrayList<Author>();
		
		
		static {
		    	authors.add(new Author("Aristoteles", "aristoteles@gmail.com", 'w'));
		    	authors.add(new Author("Plato","plato@gmail.com", 'w'));
		    	authors.add(new Author("Kant", "kant@gmail.com", 'm'));
				authors.add(new Author("Heidegger", "heidegger@gmail.com", 'm'));
		    			    		    
		}

	    static {
	    	books.add(new Book("Metafisica", "Aristoteles", -300, "Alianz" , 1500 ));
	    	books.add(new Book("Simposium","Plato", -450, "Alianz" , 1800 ));
	    	books.add(new Book("Empirismo y subjetividad","Deleuze", 1953, "Alianz" , 1000 ));
	    	books.add(new Book("La gaya ciencia ","Nietzsche", 1882, "Alianz" , 1200 ));
	    	books.add(new Book("Escritos autobiográficos","Maria Zambrano", 1953, "Alianz" , 1000 ));
	    	//books.add(new Book("Escritos autobiográficos", authors.get(4), 1953, "Alianz" , 1000 ));
	    	
	    }
}