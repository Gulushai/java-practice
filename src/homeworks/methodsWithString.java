package homeworks;

public class methodsWithString {

	public static void main(String[] args) {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }

		public static String lameDb(String db, String op,String id,String data) {
		String str = "";
		   if(op.equals("add")) {
			   db =db+ id +data;
		   }
		   if(op.equals("edit")) {
			   db.substring(beginIndex, endIndex);
		   }return 
		   
		   
		   
		    
		    
		  }//end lameDb
		  
		  
		   
	

}
