package day35ArraysMethods;

public class MethodDecription {

	public static void main(String[] args) {
		System.out.println(decryptSentence("qzez rh ufm"));
		System.out.println(decryptSentence("ovgh tl slnv"));
		System.out.println(decryptSentence("szev z tllw wzb"));
		System.out.println(decryptWord("pfnfhszr"));
		System.out.println(decryptSentence("ovgh tl slnv"));

	}
	public static char decryptChar (char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		//return encrypted.charAt(alphabet.indexOf(ch));
		int i = encrypted.indexOf(ch);
		char r = alphabet.charAt(i);
		return r;
		
	}
	/*
	 * encryptWord
	 * return type: String
	 * param: String
	 * take a string and returns encrypted version for the whole word
	 */
	public static String decryptWord (String word) {
		String converted = "";
		for(int i=0; i<word.length(); i++) {
			converted += decryptChar(word.charAt(i));
		}
		return converted;
	}
	/*
	 * encryptSentence
	 * return type: String
	 * param: String sentence
	 * Split the sentence by space and call encryptWord and 
	 * return encrypted sentence
	 */
	public static String decryptSentence (String sentence) {
		String[] strArray = sentence.split(" ");
		String retValue ="";
		for(String word: strArray) {
			retValue += decryptWord(word)+" ";
		}
		return retValue.trim();
		
	}
}
