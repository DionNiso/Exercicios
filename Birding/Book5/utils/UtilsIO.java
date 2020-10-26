package utils;

import java.util.Scanner;

public class UtilsIO {
	
	//static menu methods for IO
	public static String ask(Scanner reader, String option) { 
		//Prompt
		System.out.println(option);
		
		//get the user answer
		option = reader.nextLine();
		
		return option;
	}
	
	public static int askObservation(Scanner reader) { 
		//Prompt
		System.out.println("How many observations do you want to add?");
		
		while(true) {
			try {
			    return Integer.parseInt(reader.nextLine());
			  } catch (NumberFormatException e) {  
				  System.out.println("Sorry, you did not entered a number! Watch it!");;
			  }
		}
	}
	
	public static String askForTitle(Scanner reader) {
		System.out.println("Title: ");
		return reader.nextLine();
	}
	
	public static int askForYear(Scanner reader){
		System.out.println("Year: ");
		while(true) {
			try {
			    return Integer.parseInt(reader.nextLine());
			  } catch (NumberFormatException e) {  
				  System.out.println("Sorry, you did not entered a number! Watch it!");;
			  }
		}
	}
	
	public static String askForPublisher(Scanner reader){
		System.out.println("Publisher: ");
		return reader.nextLine();
	}
	public static String askForAuthorToAsign(Scanner reader){
		System.out.println("AuthorToAsign: ");
		return reader.nextLine();
	}
	
	
	public static int askForCost(Scanner reader){
		System.out.println("Cost: ");
		while(true) {
			try {
			    return Integer.parseInt(reader.nextLine());
			  } catch (NumberFormatException e) {  
				  System.out.println("Sorry, you did not entered a number! Watch it!");;
			  }
		}
	}
	public static String askForAuthorName(Scanner reader){
		System.out.println("Author's Name: ");
		return reader.nextLine();
	}
	public static String askForEmail(Scanner reader){
		System.out.println("email: ");
		return reader.nextLine();
	}
		
	public static char askForGender(Scanner reader){
		System.out.println("gender: ");
		char gender = reader.next().charAt(0);
		return gender;
	}
	
	
	public static void noBookMessage (String name) { 
		//Print the complete DB
		System.out.println(name + " does not exist in our DB!");
		
	}
}
