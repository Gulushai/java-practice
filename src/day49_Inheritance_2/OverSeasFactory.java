package day49_Inheritance_2;
import day49_Inheritance.Device;
//Non-sub class in different package
public class OverSeasFactory {

	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "Samsung";
		//dv.model = "3200"; not visible it is protected
		//dv.price = 1000; not visible
		//dv.country = "El Salvador"; not visible
	}

}
