package homeworks;

import java.util.Scanner;

public class EqualsJavaPython {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int countj =0;
	    int countp = 0;
	    
	    for(int i=0; i<sentence.length()-3; i++) {
	    	String java = sentence.substring(i, i+4);
	    	if(java.equalsIgnoreCase("java")) {
	    		countj+=i;
	    	}
	    	// System.out.println(countj);
	    }
	    for(int i=0; i<sentence.length()-5; i++) {
	    	String python = sentence.substring(i, i+5);
	    	if(python.equalsIgnoreCase("python")) {
	    		countp +=i;
	    	}
	    	// System.out.println(countp);
	    	 
	    	 if(countj == countp) {
	    		 System.out.println(true);
	    	 }else {
	    		
	    	 }
	    	 
	    }
	    

	}

}
