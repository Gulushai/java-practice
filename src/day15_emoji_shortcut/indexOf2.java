package day15_emoji_shortcut;

public class indexOf2 {

	public static void main(String[] args) {
		
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("first dash " + firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("second dash "+secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println("third dash "+thirdDash);
		
		int thirdDash1 = list.indexOf("-", secondDash-1);
		System.out.println("third dash "+thirdDash1);
		
		int thirdDash3 = list.indexOf("-", firstDash-2);
		System.out.println("third dash "+thirdDash3);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last Dash "+lastDash);

	}

}
