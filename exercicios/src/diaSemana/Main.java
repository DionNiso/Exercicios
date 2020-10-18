package diaSemana;
import java.util.Scanner;

public class Main {
		
		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Program to print the day of a week");
			System.out.println("Please write a day :"); 
			int day = Integer.parseInt(reader.nextLine());
	
			System.out.println("Please write a month :");
			int month = Integer.parseInt(reader.nextLine());
			
			System.out.println("Please write a year :");
			int year = Integer.parseInt(reader.nextLine());
					
			Integer intDay = Integer.toString(day).length();
			if (intDay == 2) {
				return;
			}
			
			Integer intMonth = Integer.toString(month).length();
			if (intDay == 2) {
				return;
			}
			
			Integer intYear = Integer.toString(year).length();
			if (intDay == 4) {
				return;
			}
			
			reader.close();		
		}
}