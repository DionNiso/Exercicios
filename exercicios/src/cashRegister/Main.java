package cashRegister;
public class Main {
	public static void main(String[] args) {

	//CashRegister payAMeal = new CashRegister(1000);
	
	CashRegister payAMeal = new CashRegister(0);
	
	LyyraCard customer1 = new LyyraCard(8);
	LyyraCard customer2 = new LyyraCard(70);	

	double theChange = payAMeal.payEconomical(10.5);
	System.out.println("the change was " + theChange );
		
	boolean succeeded = payAMeal.payGourmet(customer1);
	System.out.println("payment success: " + succeeded);
	
	succeeded = payAMeal.payEconomical(customer1);
	System.out.println("payment success: " + succeeded);
	
	double remaining = customer1.balance();
	System.out.println("remaining balance: " + remaining);
	
	succeeded = payAMeal.payGourmet(customer1);
	System.out.println("payment success: " + succeeded);
	
	succeeded = payAMeal.payEconomical(customer2);
	System.out.println("payment success: " + succeeded);
	
	succeeded = payAMeal.payEconomical(customer2);
	System.out.println("payment success: " + succeeded);
	
	succeeded = payAMeal.payGourmet(customer2);
	System.out.println("payment success: " + succeeded);
	
	succeeded = payAMeal.payGourmet(customer1);
	System.out.println("payment success: " + succeeded);
	
	System.out.println( payAMeal );
		
	}
}

