package homeworks;

import java.util.ArrayList;

public class MethodsWithArrayListRemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void removeAll(ArrayList<String> wordList, String targetWord){
		  
		while(wordList.contains(targetWord)) {
			wordList.remove(targetWord);
		}
		  
		  
		}

}
