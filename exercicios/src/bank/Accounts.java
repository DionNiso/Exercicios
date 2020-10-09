package bank;

import java.util.Scanner;

import apartment.Apartment;

public class Accounts {
	
	public static void main(String[] args) {
		Account robinHood = new Account("robinHood", 5000); 
		Account amancioOrtega = new Account("amancioOrtega", 4200); 
		
		robinHood.deposit(300);
		System.out.println(robinHood);
}
/*public static void transfer (Account a1, Account a2) {
		double transferQuantity;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter with the amount to transfer: ");
		
		transferQuantity = reader.nextInt(); 
		
		System.out.println("Enter the number of the account: ");
		Account.accountNumber = reader.nextInt();
	
	
a1.balance -= transferQuantity;
a2.balance += transferQuantity;
	
}*/
	public static void personalCredit  () {			
		
	}

	public static void yourMethod () {
		
	}

}
