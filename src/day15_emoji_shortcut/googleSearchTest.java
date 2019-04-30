package day15_emoji_shortcut;

public class googleSearchTest {

	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + " _ Google Search";
		
		if(pageTitle.startsWith(item)) {
			System.out.println("PASS: Page title check passed");
		}else {
			System.out.println("FAIL: Page title check failed");
		}
		if (pageTitle.endsWith("Google Search")) {
			System.out.println("Pass: Google search is in title");
		}else {
			System.out.println("FAIL: Page title check failed");
		}
		
	}

}
