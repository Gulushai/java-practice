package day53_Inheritance;

public class City {
	private int id;
	private String name;
	public int count = 100;

	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void letsBuildARoad() { // non static method can call static method
		buildARoad();
	}
	
	public static void buildARoad() {
		System.out.println("City -  building a road");
	}
	
	@Override
	public int hashCode() {
		return id + name.length();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		City anotherCity = (City)obj;// objects are casted from top to bottom/down casting
		if(this.id == anotherCity.id && 
		   this.name.equals(anotherCity.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", count: "+ count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
