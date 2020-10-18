package exercicios;
import java.util.Scanner;

public class Ej49 {
		
		public static void main(String[] args) {
	
		lastCharacter();
		}

public static char lastCharacter() {
	System.out.println("Program to print the last character of a given word");
	System.out.println("Please write a word :");  
	Scanner reader = new Scanner(System.in); 
	String name = reader.nextLine();
	char character = name.charAt(name.length() -1);
			
	System.out.printf("the last character of your word is " + (character));
	reader.close();		
	return character;
	}
}