package exercicios;
import java.util.Scanner;

public class Ej48 {
		
		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in); 
			System.out.println("Program to print the lenght of the word you write");
			System.out.println("Please write a name :");  
			String name = reader.nextLine();
					
			System.out.printf("the lenght of the word you wrote is: %d", name.length());
			reader.close();		
		}
}
