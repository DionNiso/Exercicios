package library;

public class Main {

	public static void main(String[] args) {
	
		Library library = new Library();
	
	
//	Book banquete = new Book ("Simposium" , "Platón" , 10);	
//	library.addBook(banquete);
	
	
	library.addBook(new Book("Metafisica" , "Aristoteles" , 60));
	
	library.addBook(new Book("Mas alla del bien y del mal" , "Nietzsche" , 1860));

	for (Book book : library.searchByTitle("SimposiUM")) {
		System.out.println(book);
	}
	for (Book book : library.searchByTitle("meTAfisica")) {
		System.out.println(book);
	}
	for (Book book : library.searchByAuthor("ARISTOTELES")) {
		System.out.println(book);
	}	
	
	for (Book book : library.searchByYear(60)) {
		System.out.println(book);
		}	
	for (Book book : library.searchByYear(1860)) {
		System.out.println(book);
		}	
	for (Book book : library.searchByYear(700)) {
		System.out.println(book);
		}
	for (Book book : library.books) {
		book.getTitle().contains("ssss");
		if (true);
		{
			System.out.println("The list contains the book"); 
		}
		
	}
//	
//	boolean arr = banquete.title.contains("Metafi");
//	  if (arr) 
//		  System.out.println("The list contains the book"); 
//	  else
//		  System.out.println("The list does not contains the book"); 
//
//	
//	  boolean arr1 = banquete.getTitle.contains("alla");  
//	  if (arr1) 
//		  System.out.println("The list contains the book"); 
//	  else
//		  System.out.println("The list does not contains the book"); 
	  
//	 boolean arr = banquete.getTitle("Metafi");
//		//arr.title.contains("Metafi");
//			if (arr) 
//			  System.out.println("The list contains the book"); 
//			else
//			  System.out.println("The list does not contains the book"); 		  
		}
	
}
