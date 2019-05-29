package day42_CustomClasses_encapsulation;

public class Coffee {

	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		System.out.println("Name: "+name.toUpperCase()+", Size: "+size.toUpperCase()+", Price: $"+price+", CAL: "+calories);
	}
	
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
		name = newName;
		setSize(newSize);
		price = newPrice;
		calories = newCal;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall")|| newSize.equalsIgnoreCase("grande")|| newSize.equalsIgnoreCase("venti")) {
		size = newSize;
		}else {
		System.out.println("ERROR: Invalid Size - "+ newSize);
		}
	}
	
	public void setPrice(Double newPrice) {
		price = newPrice;
	}

}
