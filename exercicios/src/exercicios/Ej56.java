package exercicios;
import java.util.Scanner;

public class Ej56 {
		
	public static void main(String[] args) {
		System.out.println("Please type a text :");  
		Scanner reader = new Scanner(System.in);
		String name = reader.nextLine();
		System.out.println("result :" + reverse(name));  
		}

		public static String reverse (String text) {
	
			String result = "";
			for (int i = text.length()-1; i >= 0; i--) {
			result += text.charAt(i);
			}
			return result;
		}	
}