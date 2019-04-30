package day24_Arrays;

public class ArrayOfChars {

	public static void main(String[] args) {
		char[] values = {'a', 'b', 'c'};
		for(char value:values) {
			System.out.println(value);
		}
		String  str = "Wooden Spoon";
		//this method toCharArray() converts string into array of characters
		 char[] chars = str.toCharArray();
		 for(char c: chars) {
			 System.out.print(c+"_");
		 }
		 System.out.println();
		 str = "";
		 for (int i=chars.length-1; i>=0; i--) {
			 str +=chars[i];
			 System.out.print(chars[i]);
		 }
		 //Print characters with help of array of characters, one by one. If characters is equals to 'o', 
		 //replace with (print it instead of 'o')
		 System.out.println();
		 for (char c: chars) {
			 if(c =='o') {
				 System.out.print("*");
			 }else {
				 System.out.print(c);
			 }
		 }
		 System.out.println();
		 char[] newChars = new char[3];
		 System.out.println("Value of char: "+newChars[0]);
		 System.out.println(String.valueOf(newChars[0]).length());
		 System.out.println(newChars[0]+0);
		 
		 
		}	
}
