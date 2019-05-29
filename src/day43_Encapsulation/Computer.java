package day43_Encapsulation;

public class Computer {
	private String brand;
	private String os;
	private double price;
	
	//add a constructor
	public Computer() {
		System.out.println("Computer constructor ...");
		brand = "unknown";
		os = "unknown";
	}
	public Computer(String brand, String os, double price) {
		this.brand = brand;
		this.os = os;
		this.price = price;
	}
	public String toString() {
		return "Brand: "+brand+", OS: "+os+", Price: "+ price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getOs() {
		return os;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	
}
