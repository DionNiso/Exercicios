package exercicios;
import java.util.Scanner;

public class Ej50 {
		
		public static void main(String[] args) {
	
			System.out.println("Program to print the first three character of a given word");
			System.out.println("Please write a word :");  
			Scanner reader = new Scanner(System.in);
			String name = reader.nextLine();
					
			if (name.length() < 3) { 
				return;
			}
			int character = 0;
				while ( character < 3) {
					System.out.println ((character+1) + "character: " + name.charAt(character));
					character++;
				}
			reader.close();		
		}
}


