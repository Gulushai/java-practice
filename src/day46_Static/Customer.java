package day46_Static;

public class Customer {
	private String name;
	private String email;
	static int count;//shared by everyone// all objects
	
	public Customer() {
		this.email="undefined";
		name="undefined";
		count++;
		
	}
	public Customer(String name, String email) {
		this.email=email;
		this.name=name;
		count++;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name="";
	}
}
