package day15_emoji_shortcut;

import java.util.Scanner;

public class Emoji_Shortcut {

	public static void main(String[] args) {
		String smile, wink, surptised, playful, upset, sad;
		Scanner scan = new Scanner(System.in);
		System.out.println("Print your mood");
		
		String emoji = scan.next();
		
		if (emoji.length() !=2) {
			System.out.println("invalid emoji");
			return;
		}
		//if code reaches this point, then emoji is 2 chars
		//get first and second chars and assign to variables
		 char first = emoji.charAt(0);
		 char second = emoji.charAt(1);
		 
		if (first ==':') {
		 if (second == ')') {
			System.out.println("smile");
		 }else if (second == '(') {
			System.out.println("sad");
		 }else if (second =='/') {
			System.out.println("upset");
		 }else if (second =='p') {
			 System.out.println("playful");
		 }
		}else if (first ==';') {
		if (second == ')') {
			System.out.println("wink");
		 }else if (second == 'O') {
			System.out.println("surprised");
		 }
		}else if (first =='(')	{
		if (second == ':') {
			System.out.println("smile");
		 }else {
			System.out.println("unknown emoji");
		 }
		}else if (first ==')') {
		} else {
			System.out.println("invalid emoji");
		  return;
		}
		 
	}

}
