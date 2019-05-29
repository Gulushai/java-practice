package day50_Inheritence;

public class App {
	//encapsulated name
	private String name;//not static so 
	public static int count;//static will change in all inherited classes
	
	public static void build(String language) {
		System.out.println("Buiding an app using "+ language);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public App(String name) {
		this.name = name;
	}
	
	
}
