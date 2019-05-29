package day49_Inheritance;

public class PaperBack extends Book{
	private int Pages;

	public String toString() {
		return getTitle()+" | "+getAuthor()+ " | "+ getPrice()+ " | "+ getType()+ " | "+ Pages;
	}
	public int getPages() {
		return Pages;
	}

	public void setPages(int pages) {
		Pages = pages;
	}
	
}
