package day37ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		
		List<String> cars = new ArrayList <>();
		
		cars.add("Honda");
		
		List<Integer> nums = Arrays.asList(4,12,6,43,7);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		nums.add(100);
		System.out.println(nums.toString());
		
		List<Double> prices = Arrays.asList(23.4, 43.6, 12.91, 4.5, 6.9, 76.7, 0.9, 76.5, 543.1, 32.2);
		System.out.println(prices);
		double sum = 0;
		for(double price: prices) {
			sum +=price;
		}
		System.out.println("Sum: " +sum);
		
		double sum2 = 0;
		for(int i=0; i<prices.size(); i++) { //get (1.5)
			sum2 +=prices.get(i); 
		}
		System.out.println("Sum2: "+sum2);
		
		List<Double> expensive = new ArrayList<>();
		for(double price : prices) {
			if(price>=100.0) {
				expensive.add(price);
			}
		}
		System.out.println("Expensive: "+expensive.toString());
		
		prices.removeAll(expensive);
	}

}
