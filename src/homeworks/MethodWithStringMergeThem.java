package homeworks;

public class MethodWithStringMergeThem {

	public static void main(String[] args) {
		System.out.println(mergeStrings("12345", "kumushai"));

	}
	public static String mergeStrings(String one, String two) {
		String str = "";
		String shortest = "";
		String longest = "";
	    if(one.length()> two.length()) {
	    	longest = one;
	    	shortest = two;
	    } else {
	    	longest = two;
	    	shortest = one;
	    }    	
	    for(int i=0; i<shortest.length(); i++) {
	    	str += one.substring(i,i+1)+two.substring(i, i+1);
	    }
	    	str = str+longest.substring(shortest.length());
	    		return str;	
	    	} 
}

