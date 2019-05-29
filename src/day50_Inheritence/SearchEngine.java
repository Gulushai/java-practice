package day50_Inheritence;

public class SearchEngine {
	String item;
	String item2;
	public int Search(String item) {
		System.out.println("Searching for: "+ item);
		int resultsCount = item.length();
		return resultsCount;
	}
	protected void Search(String item, String item2) {
		System.out.println("Searching for: "+ item+ " , "+ item2);
		int resultsCount = item.length();
		System.out.println("Total count: "+ resultsCount);
	}
	String clickResut() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
}
