package day15_emoji_shortcut;

public class IndexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		System.out.println(word1.indexOf('g'));//0
		System.out.println(word1.indexOf("th"));//2
		System.out.println(word1.indexOf("hub"));//3
		
		System.out.println(word1.indexOf("a"));//-1
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("position of . :" + i);
		System.out.println(url.charAt(i+1));
		System.out.println(url.charAt(i+2));
		System.out.println(url.charAt(i+3));
		
		String title = "java - Google Search";
		System.out.println(title.indexOf(" "));
		int b = title.indexOf("-");
		System.out.println(title.charAt(b-1));
		System.out.println(title.charAt(b+1));
		System.out.println(title.charAt(b+2));
		
		String country = "United States of America";
		int st = country.indexOf("States");//7
		System.out.println("Position of states:" +st);
		
		country.contains("of");
		System.out.println("of is there");
		
		if (country.indexOf("of")> -1) {
		System.out.println("position of is there");
		}else {
			System.out.println("of is not there");
		}
	}

}
