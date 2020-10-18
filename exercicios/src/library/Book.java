package library;

public class Book {

	//public String title;
	private String title;
	private String author;
	private int publishingYear;
		
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
	public int getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public Book (String title, String author, int publishingYear) {
		this.title = title;
		this.author = author;
		this.publishingYear = publishingYear;
	}	
		public String toString() {
			return ("title " + this.title  +", author " + this.author  +  ", publishingYear " + this.publishingYear);
				
	}
	public String Title() {
		return title;
	}

	public String Author() {
		return author;
	}


	public int publishingYear() {
		return publishingYear;
	}

}
