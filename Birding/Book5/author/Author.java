package author;

import java.util.ArrayList;

import model.Book;

public class Author {
	private String name;
	/*private int age;
	private int weight;
	private int height;*/
	private String email;
    private char gender;
    private ArrayList<Book> books;

	
	public String toString() {
		String author = this.name + "(" + this.gender + ") at " + this.email + this.books;
        return author;
	}

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
       this.books = new ArrayList<Book>();
	}
	
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }

	/*public void printPerson() {
		System.out.println(this.name + ", age " + this.age + " years");
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void becomeOlder() {
		this.age = this.age + 1;
		
	}
	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		} 
		return true;
	}
	public void setWeight(int newWeight){
		this.weight = newWeight;
	}
	public void setHeight(int newHeight){
		this.height = newHeight;
	}
	
	public double bodyMassIndex() {
		double heightDivideByHundred =  this.height / 100;
		return this.weight / (heightDivideByHundred * heightDivideByHundred);
	}*/	
}


