package day39_ArrayList;
import java.util.*;
public class setGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<>();
list.add("Kumushai");
list.add("Tsoomoo");
list.add("Muugii");
System.out.println(list);
list.set(0, "Ayguli");
System.out.println(list);

String a=list.get(0).toUpperCase();
list.set(0, a);
System.out.println(list);
list.add(0,"Muugii");
System.out.println(list);
	}

}
