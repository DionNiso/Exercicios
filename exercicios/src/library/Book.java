package library;

public class Book {

	private String title;
	private String author;
	private int publishingYear;
	

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
//
//	public void settitle(String title) {
//		this.title = title;
//	}

	public String Author() {
		return author;
	}

//	public void setAuthor(String author) {
//		this.author = author;
//	}

	public int publishingYear() {
		return publishingYear;
	}

//	public void setpublishingYear(int publishingYear) {
//		this.publishingYear = publishingYear;
//	}

//	public void printBook() {
//		System.out.println(this.title + ", title " + this.author + " author" + this.publishingYear + "publishingYear");
//	}

}
