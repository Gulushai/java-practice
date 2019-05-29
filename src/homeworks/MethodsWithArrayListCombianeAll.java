package homeworks;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsWithArrayListCombianeAll {

	public static void main(String[] args) {
		ArrayList<String> wordList1 = new ArrayList<>();
		ArrayList<String> wordList2 = new ArrayList<>();
		wordList1.add("flower");
		wordList1.add("sun");
		wordList1.add("apples");
		wordList2.add("array");
		wordList2.add("list");
		String wordsList2 = "flower";
		System.out.println(combineAL(wordList1,wordList2));
		System.out.println(removeAll(wordList1, wordsList2));

	}
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
		 wordList1.addAll(wordList2);
		  return wordList1;
		  
		}
	public static ArrayList<String> removeAll(ArrayList<String> wordList1, String wordsList2){
			  wordList1.remove(wordsList2);
			  return wordList1;
		  
	}
}
