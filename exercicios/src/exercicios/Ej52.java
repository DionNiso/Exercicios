package exercicios;
import java.util.Scanner;

public class Ej52 {
		
		public static void main(String[] args) {
	
			System.out.println("Program to print the reversing characters of a given word");
			System.out.println("Please write a word :");  
			Scanner reader = new Scanner(System.in);
			String name = reader.nextLine();
					
			int character = name.length() -1; 
			
				while (character >= 0)
			{
					System.out.println ((character +". ") + "character: " + name.charAt(character));
					character--;
				}
			reader.close();		
		}
}