public class CashRegister {
	private double cashInRegister;
	private int economicalSold;
	private int gourmetSold;
	
	private static final double price_of_economical = 3.5;
	private static final double price_iof_gourmet = 4.0;
	public CashRegister(double cashInRegister){
		this.cashInRegister = cashInRegister;
	}
		public double cashInRegister() {
			return this.cashInRegister;
	
	}
	public double payEconomical(double cashGiven) {

		if (cashGiven < price_of_economical) {
		return cashGiven; 
				//this.economicalSold--;
		}
		this.cashInRegister += price_of_economical;
		this.economicalSold++;
		this.cashInRegister++;
		return cashGiven -= price_of_economical;
	}
	public double payGourmet(double cashGiven) {

		if (cashGiven < price_iof_gourmet) {
		return cashGiven;
		}
		this.cashInRegister += price_iof_gourmet;
		this.gourmetSold++;
		this.cashInRegister++;
		return cashGiven -= price_iof_gourmet;
		}
	public boolean payEconomical(LyyraCard card) {
		if (card.balance() < price_of_economical) {
		return false;
		}
		card.pay(price_of_economical);
		this.economicalSold++;
		return true;
		}
	public boolean payGourmet(LyyraCard card) {
		if (card.balance() < price_iof_gourmet) {
		return false;
		}
		card.pay(price_iof_gourmet);
		this.gourmetSold++;
		return true;
		}
	public void loadMoneyToCard(LyyraCard card, double cashInRegister) {
		if (cashInRegister < 0) {
		return;
		}
		card.loadMoney(cashInRegister);
		this.cashInRegister += cashInRegister;
		}
		public String toString() {
		return "money in register " + cashInRegister + " economical lunches sold: " +
		economicalSold + " gourmet lunches sold: " + gourmetSold;
		}
}