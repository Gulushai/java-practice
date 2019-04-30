package day24_Arrays;

public class Cities {

	public static void main(String[] args) {
		// 
		String [] cities = {"Washington D.C.", "Kyiv", "Annandale", "Moscow", "Istanbul", "Baku", "Miami", "Silver Spring", "McLean"};
		//System.out.println(cities.length);
		//Task print all cities that starts with M
		for(int i=0; i<cities.length; i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
			
		}
		//Same thing with for each loop
		for(String str: cities) {
			if(str.startsWith("M")) {
				System.out.println(str);
			}
		}
	}

}
