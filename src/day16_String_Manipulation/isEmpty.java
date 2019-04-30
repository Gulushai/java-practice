package day16_String_Manipulation;

public class isEmpty {

	public static void main(String[] args) {
		String userName = "";
		System.out.println(userName.isEmpty());

		if (userName.isEmpty()) {
			System.out.println("User name field cannot be empty");

		} else {
			System.out.println("Username is not empty");
		}

		String password="sdaf";
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		} else {
			System.out.println("Username or password is not empty");
		}
		if (userName.length()==0){
			System.out.println();
		}
	}

}
