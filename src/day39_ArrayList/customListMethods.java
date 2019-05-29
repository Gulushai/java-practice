package day39_ArrayList;
import java.util.*;
public class customListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10); numsList.add(20); numsList.add(10); numsList.add(7); 
		numsList.add(8); numsList.add(4); numsList.add(8); numsList.add(3); 
		numsList.add(11); numsList.add(3); 
		printList(numsList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.8);

		System.out.println("Sum: "+sumList(doubleList));
		
		System.out.println(getList(10));
		ArrayList<Integer> list = getList(15);
		System.out.println(list);
		
		System.out.println();
		System.out.println(getRandomList(8));
		List<Integer> rList = getRandomList(5);
		System.out.println(rList);
		
		printList(getRandomList(7));
		
		List<String> strNums = new ArrayList<>();
		strNums.add("56");
		strNums.add("43");
		strNums.add("12");
		strNums.add("65");
		strNums.add("88");
		List<Integer> converted=convertToIntList(strNums);
		System.out.println(converted);
	}
	public static void printList(List<Integer> nums) {
		for( int i : nums) {
		System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public static double sumList(List<Double> number) {
		
		double sum = 0;
		for(double n : number) {
			sum = sum+n;
		}
		return sum;
	}
	
	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList = new ArrayList<>();
		for(int i=1; i<=size; i++) {
			newList.add(i);
		}
			return newList;
		}
	public static List<Integer> getRandomList(int size){
		Random ran = new Random();
		ArrayList<Integer> randomList = new ArrayList<>();
		for(int i=1; i<=size; i++) {
			randomList.add(ran.nextInt(101));
	}
		return randomList;
}
	public static List<Integer> convertToIntList(List<String> strList) {
		List<Integer> strL = new ArrayList<>();
		for(String str : strList) {
			strL.add(Integer.parseInt(str));
		}
		return strL;
	}
}
