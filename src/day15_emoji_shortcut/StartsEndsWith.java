package day15_emoji_shortcut;

import java.util.Scanner;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word1 = "eclipse";
System.out.println(word1.startsWith("e"));//true
System.out.println(word1.startsWith("ec"));//true

System.out.println(word1.startsWith("Ec"));//false

System.out.println(word1.endsWith("e"));//true
System.out.println(word1.endsWith("pse"));//true
System.out.println(word1.endsWith("PSE"));//false
System.out.println(word1.toUpperCase().endsWith("PSE"));//true

String name ="Mrs.Jackson";
System.out.println(name.startsWith("Mrs"));//false

if (name.startsWith("Mr.")) {
	System.out.println("man");
} else if(name.startsWith("Mrs.")) {
	System.out.println("Merried woman");
} else if(name.startsWith("Ms.")) {
	System.out.println("single woman");
}else if(name.startsWith("Dr.")) {
	System.out.println("Doctor man or woman");
}else {
	System.out.println("unknown status");
}

	}

}
