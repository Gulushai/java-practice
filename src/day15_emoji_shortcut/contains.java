package day15_emoji_shortcut;

public class contains {

	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list= "potato, apples, eggs, milk, bread, cereal, meat";
		
		if (list.contains("apples")) {
			System.out.println("Apples are there");
		}else if(list.contains("avocados")) {
			System.out.println("Letts add apples now");
		}
		boolean hasCucumbers =list.contains("cucumbers");
		System.out.println("contains cucumbers:" + hasCucumbers);
		
		email = "name@yahoo.com";
		if(email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		}else if (email.contains("@gmail")) {
			System.out.println("Gmail account");
		}else if (email.contains("@mail")) {
			System.out.println("Mail account");
		}
		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains("|")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		
		String name = "Kumushai";
		if(name.contains("a") || name.contains("e") ){
			System.out.println("'a' or 'e' is there");
		}else {
			System.out.println("not ther");
		}
	}

}
