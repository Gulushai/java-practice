package homeworks;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("listen", "silent"));
	}

	public static boolean isAnagram(String word1, String word2) {

		int count1 = 0;
		int count2 = 0;
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		if (word1.length() != word2.length()) {
			return false;
		}
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i) == word1.charAt(j)) {
					count1++;
				}
				if (word1.charAt(i) == word2.charAt(j)) {
					count2++;
				}
			}
		}
		if (count1 == count2) {
			return true;
		}
		return false;
		

	}
//	public void str(String word1,String word2) {
//		
//		word1 = word1.toLowerCase();
//		word2 = word2.toLowerCase();
//		
//		String str1="";
//		String str2="";
//		
//		for(int i=0;i<word1.length();i++) {
//			str1+=word1.charAt(i)+",";
//		}
//		
//		for(int i=0;i<word2.length();i++) {
//			str2+=word2.charAt(i)+",";
//		}
//	
//	
//	String[]arr1=str1.split(",");
//	String[]arr2=str2.split(",");
//	
//	Arrays.sort(arr1);
//	Arrays.sort(arr2);
//	
//	
//	return Arrays.equals(arr1, arr2);
//	
//	}
}
