package day40ArrayList;

public class InfoForContact {
	public static void main(String[] args) {
		Contact info = new Contact();
		info.name = "Kumushai";
		info.phoneNumber="443-924-8292";
		info.email="gulushai@gmail.com";
		
		System.out.println("My name: "+info.name);
		System.out.println("My phoneNumber: "+ info.phoneNumber);
		System.out.println("My email: "+ info.email);
		
		System.out.println();
		
		info.call();
		info.sendMessage();
		info.sendEmail();
	}
}
