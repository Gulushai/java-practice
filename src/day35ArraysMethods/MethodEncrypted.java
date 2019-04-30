package day35ArraysMethods;

import java.util.Scanner;

public class MethodEncrypted {

	public static void main(String[] args) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word = "kumushai";
		
		char letter = word.charAt(0);
		int position= alphabet.indexOf(letter);
		System.out.println("position: "+position);
		char enChar = encrypted.charAt(position);
		System.out.println(letter + " --> "+enChar);
		
		String encryptedWord = "";
		for( int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			//find char in alphabet string
			int index = alphabet.indexOf(ch);

//			System.out.print(encrypted.charAt(index));
			encryptedWord +=encrypted.charAt(index);
			
				}
				System.out.println(word);
				System.out.println(encryptedWord);
				
				System.out.println(EncryptChar('z'));
				System.out.println(EncryptChar('h'));
				
				String normal= "sunday";
				String encrypt = encriptWord(normal);
				System.out.println("normal: "+ normal + "\n"+ "encrypted: "+encrypt);
				System.out.println(encryptSentence("java is fun"));
			}
	/*
	 * encryptChar
	 * return type: char
	 * param: char
	 * takes a char and returns encrupted version
	 * encryptChar('b') ==> 'y'
	 */
	public static char EncryptChar (char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		//return encrypted.charAt(alphabet.indexOf(ch));
		int i = alphabet.indexOf(ch);
		char r = encrypted.charAt(i);
		return r;
		
	}
	/*
	 * encryptWord
	 * return type: String
	 * param: String
	 * take a string and returns encrypted version for the whole word
	 */
	public static String encriptWord (String word) {
		String cyphered = "";
		for(int i=0; i<word.length(); i++) {
			cyphered += EncryptChar(word.charAt(i));
		}
		return cyphered;
	}
	/*
	 * encryptSentence
	 * return type: String
	 * param: String sentence
	 * Split the sentence by space and call encryptWord and 
	 * return encrypted sentence
	 */
	public static String encryptSentence (String sentence) {
		String[] strArray = sentence.split(" ");
		String retValue ="";
		for(String word: strArray) {
			retValue += encriptWord(word)+" ";
		}
		return retValue.trim();
		
	}
	
	
	

}
