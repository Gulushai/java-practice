package day49_Inheritance;

public class AudioBook extends Book{
	private int length;
	private String Narrator;
	
	public void listen() {
		System.out.println("Listening to "+getTitle()+" book by "+ getAuthor() + " and narrated by "+ Narrator);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getNarrator() {
		return Narrator;
	}
	public void setNarrator(String narrator) {
		Narrator = narrator;
	}
	
	
	
}
