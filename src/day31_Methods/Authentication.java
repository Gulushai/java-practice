package day31_Methods;

public class Authentication {

	public static void main(String[] args) {
		Login("mentoring@cybertek.com", "mentor001");

	}
	public static void Login(String username, String password) {
	String validUsername = "mentoring@cybertek.com";
	String validPassword = "mentor001";
	if(username.equals(validUsername) && password.equals(validPassword)) {
		System.out.println("Login Successful! Welcome to Okta!");
	}else {
		System.out.println("Sign in failed");
	}
	
	}
}
