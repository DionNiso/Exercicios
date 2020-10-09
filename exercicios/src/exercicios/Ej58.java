package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej58 {
		
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>(); 
		System.out.println("Program to detect a recurring word");  
		
		while (true) {
			
		System.out.print("Please type a word :");  
		String word = reader.nextLine();
		//System.out.println("result :" + (word));  
			if (words.contains(word)) {
				System.out.println("You gave the word " + word +  " twice");
				break;
			}
		words.add(word);		
		}
	}
}