package exercicios;

import java.util.Scanner;

public class October01 {
	public static void main(String[] args) {
	//System.out.println("Hello, welcome to our 3rd class!");
	System.out.println("Write a value ");
	Scanner reader = new Scanner(System.in);
	int num1 = Integer.parseInt(reader.nextLine());
	//exerc1(num1);
	//exerc2(num1);
	//exerc3(num1);
	//exerc4(num1); 
	//exerc4a(num1, num2);
	exerc5(num1);
	//exerc6(num1,num2);
	}
	/* public static void exerc1(int num1) {
		 while (num1 < 101) {
			 System.out.println(num1);
			 num1++;
		 }
	 }
	public static void exerc2(int num1) {
		  while (num1 < 101 && num1 > 0) {
			 System.out.println(num1);
			 num1--;
		 }
	 }
	 public static void exerc3(int num1) {
		 
		 
		  while (num1 <= num1) {
			 System.out.println(num1);
			 num1++;
		 }
	 }
	 
	 public static void exerc4(int num1) {
		 
		 // int var1 = num1;
	 }
	 public static void exerc4a(int num1, int num2) {
		 exerc4 (num1);
		 System.out.println("Write a second value ");
		int num2 = Integer.parseInt(reader.nextLine());
		  if (num1 < num2) {
			  while (num1 <= num2) {
					 System.out.println(num1);
					 num1++;
			  }
		  }  
			 else {
				 System.out.println("First: " + num1);
				 System.out.println("Second: " + num2);
			 }
		 }*/
	public static void exerc5(int num1) {
		//System.out.println("- Until what?"); 
		int manyTimeExec = 0;
		int storeSum = 0;
		while (num1 > 1) {
			num1 = manyTimeExec;
			num1--; 
			 //manyTimeExec = num1;
			 storeSum  = manyTimeExec + num1;
			 System.out.println(storeSum);
			 
		 }
	 }
	
	/*public static void exerc5(int num1, int num2) {
		System.out.println("- Until what?"); 
		while (num1 > 0) {
			 num1--;
			 num1 = num1 + num1;
			 System.out.println(num1);
			 
		 }
	 }*/
	
	
	
 }
	
	

