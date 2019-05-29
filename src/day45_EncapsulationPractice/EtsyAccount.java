package day45_EncapsulationPractice;

import java.util.Random;

public class EtsyAccount {
	private String email;
	private String firstName;
	private String password;
	
	//constructor 1
	public EtsyAccount() {
		email = "";
		firstName = "";
		password = "";
	}
	//constructor 2
	public EtsyAccount(String firstName, String email, String password) {
		this.setFirstName(firstName);
		this.setEmail(email);
		this.setPassword(password);
	}
	//constructor 3
	public EtsyAccount(String firstName, String email) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();//should be auto generated, random with 6 characters
	}
	private String getRandomPassword() {
		Random ran = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword = "";
		for(int i=1; i<=6; i++) {
			rdPassword += letters.charAt(ran.nextInt(letters.length()));
		}
		return rdPassword;
	}
	
	public String toString() {
		return "WarmUp [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		//if it contains @ somewhere in the middle. assign it
		//if not print "Please enter a valid email address
		
		if(email.indexOf('@')>=1 && email.indexOf('@')!=email.length()-1) {
		this.email = email;
		}else {
			System.out.println("Please enter a valid email address.");
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(isValidFirstName(firstName)) {
			this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters.");
		}
		this.firstName = firstName;
	}
	private boolean isValidFirstName(String firstName) {
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		
		if(firstName.isEmpty()) {
			System.out.println("Can't be blank.");
			return false;
		}
		
		for(int i=0; i<firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if(!Character.isAlphabetic(ch) && ch !=' ') {
				return false;
			}
		}
		return true;
		
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length()>6) {
			System.out.println("Your Password must be at least 6 characters");
			this.password = "";
		}else {
			this.password = password;
		}
		
	}
	
	
}
