package day50_Inheritence;

public class IphoneApp extends App{

	public IphoneApp() {//empty arg constructor has to have super() keyword to call from the parent class
		super("IPhone App");
	}
	public IphoneApp(String name) {//one agr constructor has to have super() keyword calling the name of the parameter. 
		super(name);//super() have to call the name of the parameter
	}

	private String developer;

}
