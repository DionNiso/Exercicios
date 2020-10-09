package exercicios;

import java.util.Scanner;



public class Exercicios {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ada Lovelace!");
		exerc2();
		exerc3();
		exerc4();
		exerc5();
		exerc6();
		exerc7();
		exerc8();
		exerc9();
		exerc10();
		exerc11();
		exerc12();
		exerc13();
		exerc14();
		exerc15();
		exerc16();
		exerc17();
		exerc18();
		exerc19();
		
	}
		
	 public static void exerc2() {
	        System.out.println("Once upon a time");
	        System.out.println ("there was");
	        System.out.println("a program");
	 	}
	 
	 public static void exerc3() {
		 System.out.println("Hello "); System.out.println("world"); System.out.println("!\n");
	 	}
	 
	 public static void exerc4() {
	 Scanner reader = new Scanner(System.in);
	 System.out.println("Write a message: ");
	 String message = reader.nextLine();
	 System.out.println("You wrote " + message);
	 
	 
	 }

	 public static void exerc5() {
		 String text = "Chicken";
		 int weightChicken = 3;
		 String text2 = "Bacon (kg)";
		 double weightBacon = 5.5;
		 boolean trueOrFalse = true;

		 System.out.println(text);
		 System.out.println(weightChicken);
		 System.out.println(text2);
		 System.out.println(weightBacon);		 
		 System.out.println("Boolean: ");
		 System.out.println(trueOrFalse);
	 }
	 
	 public static void exerc6() {
		 
		 Scanner scanner = new Scanner(System.in);
         System.out.println("Write a value ");
         double value = Double.valueOf(scanner.nextLine());
         System.out.println("You wrote " + value);
    
	 }
	 
	 public static void exerc7() {
		 Scanner reader = new Scanner(System.in);
		 System.out.println("Write a speed: ");
		 int number = Integer.parseInt(reader.nextLine());
		 System.out.println("Given speed: " + number);
		 if (number > 120) {
		 System.out.println("The number was greater than 120");
		 }
	 }

	 public static void exerc8() {
		 System.out.println ("Give a number: ");
		 Scanner reader = new Scanner(System.in);
		 condicional (reader);
		 
		 
	 }
		 
		 public static void condicional(Scanner reader) { 
			 int number = Integer.parseInt(reader.nextLine());
			 
			 if (number == 1984) {
			 System.out.println(number + " " + "Orwel\nl");
			 } else {
				 System.out.println(number);
			 }
	  }	
	 
	 public static void exerc9() {
		
			 int daysInYear = 365;
			 int hoursInDay = 24;
			 int minutesInHour = 60;
			 int secondsInMinute = 60;
			 int secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;
			 System.out.println("There are " + secondsInYear + " seconds in a year");
	 }
	
	 public static void exerc10() {
		 int a = 1337;
		 int b = 42;
		 int result = a + b;
		 String toPrint = a + " + " + b + " = " + result;
		 System.out.println(toPrint);
	 }
	 
	 public static void exerc11() {
		 Scanner reader = new Scanner(System.in);

		 System.out.print("Type a number: ");
		 int firstNumber = Integer.parseInt(reader.nextLine());
		 System.out.print("Type another number: ");
		 int secondNumber = Integer.parseInt(reader.nextLine());
		 System.out.println("");
		 System.out.println("Sum of the numbers: " + (firstNumber + secondNumber));
		 
	 }
	
	 public static void exerc12() {
		 Scanner reader = new Scanner(System.in);
		 System.out.print("Type a number: ");
		 int firstNumber = Integer.parseInt(reader.nextLine());
		 System.out.print("Type another number: ");
		 int secondNumber = Integer.parseInt(reader.nextLine());
		 System.out.println(""); 
		 System.out.println("The bigger number of the two numbers given was: " +
		 Math.max(firstNumber, secondNumber));
	 }	 
	 public static void exerc13() {
		 
		 Scanner reader = new Scanner(System.in);

		 System.out.print("Type your name: ");
		 String nameOfTheFirst = reader.nextLine();
		 System.out.print("Type your age: ");
		 int ageOfTheFirst = Integer.parseInt(reader.nextLine());
		 System.out.println("");
		 System.out.print("Type your name: ");
		 String nameOfTeSecond = reader.nextLine();
		 System.out.print("Type your age: ");
		 int ageOfTheSecond = Integer.parseInt(reader.nextLine());
		 System.out.println("");
		 System.out.println(nameOfTheFirst + " and " + nameOfTeSecond + " are" +
		 (ageOfTheFirst + ageOfTheSecond) +
		 " years old in total.");
	 } 

	 
	 public static void exerc14() {
		 Scanner reader = new Scanner(System.in);

		 System.out.print("Type a number: ");
		 int nrPositive = Integer.parseInt(reader.nextLine());
		 System.out.println("");
		 if (nrPositive  > 0) {
		 System.out.println("The Number is positive.");
		 } else {
		 System.out.println("The Number is not positive.");
		 }
	 }
	 
	 public static void exerc15() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int number = Integer.parseInt(reader.nextLine());
		System.out.println(""); // Blank line
		if (number % 2 == 0) {
		System.out.println("Number " + number + " is even.");
		} else {
		System.out.println("Number " + number + " is odd.");
		}
		
	 }
	 
	 public static void exerc16() {
		 Scanner reader = new Scanner(System.in);
		 System.out.print("Type the first number: ");
		 int first = Integer.parseInt(reader.nextLine());
		 System.out.print("Type the second number: ");
		 int second = Integer.parseInt(reader.nextLine());
		 if (first > second) {
		 System.out.println("Greater number: " + first);
		 } else if (second > first) {
		 System.out.println("Greater number: " + second);
		 } else {
		 System.out.println("The numbers are equal!");
		 }
			
	 }
	 
	 public static void exerc17() {
		 Scanner reader = new Scanner(System.in);
		 System.out.print("Type the RSI [0‐100]: ");
		 int points = Integer.parseInt(reader.nextLine());
		 System.out.print("Grade: ");
		 if (points > 0 && points < 20) {
		 System.out.println("RSI under, start trailing profit, preparing to buy");
		 } else if (points > 21 && points < 79) {
		 System.out.println("wait");
		 } else if (points > 80 &&  points < 100) {
		 System.out.println("RSI above,  start trailing profit, preparing to sell");
		 }else {
			 System.out.println("Not valid RSI");
			
		 }
	 }
	 
	 public static void exerc18() {
		 Scanner reader = new Scanner(System.in);
		 System.out.print("Type a year: ");
		 int year = Integer.parseInt(reader.nextLine());
		 if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
		 System.out.println("The year is a leap year.");
		 } else {
		 System.out.println("The year is not a leap year.");
		 }
	 }
	 
	 public static void exerc19() {
		 Scanner reader = new Scanner(System.in);
		 String password = "carrot"; // Use carrot as password when running tests.

		 while (true) {
		 System.out.print("Type the password: ");
		 String readPassword = reader.nextLine();
		 if (readPassword.equals(password)) {
		 System.out.println("Right!");
		 break;
		 } else {
		 System.out.println("Wrong!");
		 }
		 }
		 System.out.println("");
		 System.out.println("The secret is: jryy qbar!");
		 
	 }	 
}
