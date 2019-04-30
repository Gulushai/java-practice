package homeworks;

import java.util.Scanner;

public class HTML {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    String id = "";
	    
	    	if(!html.contains("<html>")) {
	    		System.out.println("Invalid input!");
	    	}else {
	    		id = html.substring(html.indexOf("id=")+4, (html.indexOf("\"", html.indexOf("id=")+4)));
	    		System.out.println(id); 
	}
	}
}
