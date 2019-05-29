package day46_Static;

public class Campus {
	private String city;
	static String country;

	static {
		System.out.println("static  block -1");
		country = "USA";
	}
	static {
		System.out.println("static  block -2");
		country = "Canada";
	}
	
	
	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
