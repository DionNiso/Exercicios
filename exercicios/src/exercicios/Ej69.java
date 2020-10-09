package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej69 {
		
	public static void main(String[] args) {
		System.out.println("Program to detect a palindrome");  
		System.out.println("Type a word");  
		Scanner reader = new Scanner(System.in);
		String text =  reader.nextLine();
		
			if (palindrome(text)) {
				System.out.println("The word is a palindrome");
			}else {
				System.out.println("The word is not a palindrome");	
			}
		//reverse();	
		}		
		public static String reverse(String text) {
			String reversed = "";
			int i = 0;
			while (i < text.length()) {
				char c = text.charAt(i);
				reversed = c+ reversed;
				i++;
						
				}
			return reversed;
			}
		public static boolean palindrome(String text) {
			boolean isPalindrome = text.equals(reverse(text));
			return isPalindrome;
	}
}