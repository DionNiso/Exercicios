package bank;

public class Account {

	private String owner;
    private double balance;
    /*public int accountNumber;
    private double transfer;*/
   
 
    public Account(String owner, double balance) {
    	this.owner = owner;
    	this.balance = balance;
        //this.accountNumber = accountNumber;
    }
 
    public void deposit(double amount) {
        balance += amount;
    }
 
    public void withdrawal(double amount) {
        balance -= amount;
    }
    public String toString() {
        return owner + " balance: " + balance;
    /*public double getBalance() {
        return balance;
    }
 
    public String getOwner() {
		return owner;
	}

    public void setOwner(String owner) {
		this.owner = owner;
	}

    public void setBalance(double balance) {
		this.balance = balance;
	}

   /* @Override
   */
    }
}

