package day16_String_Manipulation;

public class capitalCity {

	public static void main(String[] args) {
		
		String str = "Moscow is the capital of Russia";
		str = str.replace("Moscow", "Baku").replace("Russia", "Ajerbaijan");
		
		System.out.println(str);
		
		String email = "firstName_lastName@gmail.com";
		email = email.replace("firstName","gul").replace("lastName", "usman").replace("gmail","deloitte");
		System.out.println(email);
	}

}
