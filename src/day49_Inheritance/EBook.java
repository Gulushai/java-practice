package day49_Inheritance;

public class EBook extends Book{
	private int Size;
	private int Pages;
	
	public void readEBook(int pageNum) {
		System.out.println("Reading "+ getTitle() + " by "+ getAuthor() + " at page "+ pageNum);
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		this.Size = size;
	}
	public int getPages() {
		return Pages;
	}
	public void setPages(int pages) {
		Pages = pages;
	}
	
}
