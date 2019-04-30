package day14_String;

public class StringSize {

	public static void main(String[] args) {
		String str1="Good Morning";
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
		if (str1.equalsIgnoreCase("Good morning")) {
			System.out.println("match - ignore case");
		}else {
			System.out.println("not match - ignore case");
		}
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1);//it stays as old value
		str1=str1.toUpperCase();
		System.out.println("After Assignment: "+str1);
		
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("chained method");
		}else {
			System.out.println("chained methods doesnt match");
		}
		
		String myName = "Kusha";
		System.out.println(myName.length());
		int length = myName.length();
		System.out.println("My names length " + length);
		
		String userName = "Kumushai";
		if(userName.length()==8) {
			System.out.println("valid username");
		}else {
			System.out.println("invalid username");
		}
		
		String password = "12345";
		if (password.length()>=6) {
			System.out.println("valid password");
		}else {
			System.out.println("invalid password");
		}
		
		int passwordLength = password.length();
		if(passwordLength < 6) {
			System.out.println("invalid password. too short");
		}else {
			System.out.println("valid password");
		}
	}

}
