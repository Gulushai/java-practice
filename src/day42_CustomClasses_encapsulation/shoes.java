package day42_CustomClasses_encapsulation;

public class shoes {
	String brand;
	double size;
	
	public void setShoeData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;
	}
	
	public String getShoesData() {
		return brand + " | " + size;
	}
}
