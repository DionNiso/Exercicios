package model;

import java.util.ArrayList;

import author.Author;

public class Book {
		
	private String title;
    private String author;
    private int year;
    private String publisher;
    private  double cost;

    public Book(String title, ArrayList<Author> author, int year, String publisher, double cost) {
        //super();
        this.title = title;
        //this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.cost = cost;
    }
   public Book(String title, String author, int year, String publisher, int cost) {
	   this.title = title;
       this.author = author;
       this.year = year;
       this.publisher = publisher;
       this.cost = cost;
	}
	/* public Book(String title, Author author, int year, String publisher, int cost) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.cost = cost;
	}*/
	@Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", year=" + year + ", publisher=" + publisher + ", cost=" + cost + "]";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
}
	/*private String name;
	 * private String nameLatin;
	private int observations;
	public Author discoverer;*/
	
	//constructor
	/*public Book(String name,  String nameLatin, int observations, Author discoverer ) {
		this.name = name;
		this.nameLatin = nameLatin;
		this.observations = observations;
		this.discoverer =  discoverer;
	}*/
	
	//methods
	// books ...
	
	////getters and setters


	/*public Book(String name2, String nameLatin2, int observations2, ArrayList<Author> discoverer) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	

	public Author getDiscoverer() {
		return discoverer;
	}

	public void setDiscoverer(Author discoverer) {
		this.discoverer = discoverer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLatin() {
		return nameLatin;
	}

	public void setNameLatin(String nameLatin) {
		this.nameLatin = nameLatin;
	}

	public int getObservations() {
		return observations;
	}

	public void setObservations(int observations) {
		this.observations = observations;
	}
	
	
	public void addObservation(int observations) {
		this.observations += observations;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", nameLatin=" + nameLatin + ", observations=" + observations + ", discoverer=" + discoverer +"]";
	}
}*/