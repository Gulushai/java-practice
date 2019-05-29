package day38ArrayList;

import java.util.ArrayList;

public class RawArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java Day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		System.out.println(list);
		
		String str = list.get(0).toString();
		System.out.println(str);
		Integer i = (Integer) list.get(2);//downcasting
		System.out.println(i);
		//All values are stored as a raw type. We can also call it, as a General object type.
	}

}
