package day49_Inheritance;

public class Book {
	private String Title;
	private String Type;
	private String Author;
	private double Price;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		this.Type = type;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public double getPrice() {
		return Price;
	}
	
}
