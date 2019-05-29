package day41_customClasses;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depositing $ "+amount+" to "+ accountNumber);
		balance +=amount;
	}
	public void withdraw(double amount) {
		System.out.println("withdrawing "+ amount+" from "+accountNumber);
		balance-=amount;
		if(balance <0) {
			balance -=35;
		}
	}
	public void viewBalance() {
		System.out.println("==================================================================");
		System.out.println("Account Holder: "+accountHolder+", account number "+accountNumber+", balance $"+balance);
		System.out.println("==================================================================");
	}
	
	public void charge(double price, String item) {
		if(price <= balance) {
		System.out.println("Thank you for buying "+item+" for $ "+price+" from "+accountHolder);
		balance -=price;
		}else if(price>balance){
			System.out.println("Not enough balance for " + accountHolder+" to buy "+item);
		}
	}
	

}
