package day50_Inheritence;

public class Google extends SearchEngine{
	public int Search(String word) {
		System.out.println("Google Searching for: "+ word);
		int resultsCount = word.length();
		return resultsCount;
	}
	protected void Search(String item, String item2) {
		System.out.println("Searching for: "+ item+ " , "+ item2);
		int resultsCount = item.length();
		System.out.println("Total count: "+ resultsCount);
	}
	//default, protected or public will stay @Overridding
	String clickResut() {
		System.out.println("Clicking result");
		return "Search result page";
	}

}
