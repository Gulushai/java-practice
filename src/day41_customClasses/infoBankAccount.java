package day41_customClasses;

public class infoBankAccount {

	public static void main(String[] args) {
		BankAccount ba= new BankAccount();
		ba.accountHolder = "Sam Jallad";
		ba.accountNumber = 12345567;
		ba.balance = 15000.56;
		
		ba.deposit(250);
		ba.withdraw(150);
		ba.viewBalance();
		ba.charge(50, "wooden spoon");
		

	}

}
