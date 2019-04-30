package day23_Loops_Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		int [] numbers = new int [3];
		
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		// assign to the first element in the array variable value of num1
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		numbers[0] = 8;
		numbers[1] = 10;
		numbers[2] = 6;
		//we cannot different data type, we have to use data type of an array
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("****************");
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
//		byte[] bytesArray  = new byte[1000000000];
//		//maximum size of an array
//		byte[] byteArray  = new byte[Integer.MAX_VALUE-5];
		
		String [] names= new String[7];
		String [] names2= {"Shaun", "Roman", "Burak", "Maria", "Vlad" };
		
		System.out.println(names2[4]);
		System.out.println("Number of items: "+ names2.length);
		String [] countries= {};
		countries[0]="USA";
		//double [] values = 
		String [] fruits = new String [] {"apple", "orange"};
		//for each loop stands for collections of data 
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
	}

}
