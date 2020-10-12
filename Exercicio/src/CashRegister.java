public class CashRegister {
private double cashInRegister;
private int economicalSold;
private int gourmetSold;
// Javassa vakio määritellään näin
private static final double price_of_economical = 2.5;
private static final double price_iof_gourmet = 4.0;
public CashRegister() {
// at start the register has 1000 euros
this.cashInRegister = 1000;
}
public double payEconomical(double cashGiven) {
// price of the economical lunch is 2.50 euros
// if the given cash is at least the price of the lunch:
// the price of lunch is added to register
// the amount of sold lunch is incremented by one
// method returns cashGiven ‐ lunch price
// if not enough money given, all is returned and nothing else happens
if (cashGiven < price_of_economical) {
return cashGiven;
}
this.cashInRegister += price_of_economical;
this.economicalSold++;
return cashGiven -= price_of_economical;
}
public double payGourmet(double cashGiven) {
// price of the gourmet lunch is 4.00 euros
// if the given cash is at least the price of the lunch:
// the price of lunch is added to register
// the amount of sold lunch is incremented by one
// method returns cashGiven ‐ lunch price
// if not enough money given, all is returned and nothing else happens
if (cashGiven < price_iof_gourmet) {
return cashGiven;
}
this.cashInRegister += price_iof_gourmet;
this.gourmetSold++;
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
public void loadMoneyToCard(LyyraCard card, double sum) {
if (sum < 0) {
return;
}
card.loadMoney(sum);
this.cashInRegister += sum;
}
public String toString() {
return "money in register " + cashInRegister + " economical lunches sold: " +
economicalSold + " gourmet lunches sold: " + gourmetSold;

	}
}