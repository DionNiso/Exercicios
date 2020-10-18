package exercicios;
import java.util.Scanner;

public class Ej51 {
		
		public static void main(String[] args) {
	
			System.out.println("Program to print the first three character of a given word");
			System.out.println("Please write a word :");  
			Scanner reader = new Scanner(System.in);
			String name = reader.nextLine();
					
			int character = 0;
				while (character < name.length()) {
					System.out.println ((character +". ") + "character: " + name.charAt(character));
					character++;
				}
			reader.close();		
		}
}