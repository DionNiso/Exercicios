package exercicios;

import java.util.Scanner;

public class October02 {
	
	public static void main(String[] args) {
		//average();
		Scanner reader = new Scanner(System.in); 
		System.out.println("Program to find the average among three numbers");
		System.out.println("Please enter first number :"); int first = reader.nextInt();  
		System.out.println("Please enter second number :"); int second = reader.nextInt();  
		int average = average(first, second);
		System.out.printf("the average of two numbers %d, and %d is : %d %n", first, second, average);
		reader.close();		
	}
	public static int average(int first, int second) { 
		int sum = Integer.sum(first, second);
		int average = (sum / 2);
		return average;
	}
}

/*
package exercicios;

import java.util.Scanner;

public class October02 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); 
		System.out.println("Program to find greatest of three numbers");
		System.out.println("Please enter first number :"); int first = reader.nextInt();  
		System.out.println("Please enter second number :"); int second = reader.nextInt();   
		System.out.println("Please enter third number :"); int third = reader.nextInt();   
		int greatest = greatest(first, second, third);

		System.out.printf("the greatest of three numbers %d, %d, and %d is : %d %n", first, second, third, greatest);
		reader.close();
		
		}
	public static int greatest(int first, int second, int third) { 
		int max = first; 
			if (second > max) {
				max = second; }  
					if (third > max) { max = third; }  
						return max;
		}
}

*/