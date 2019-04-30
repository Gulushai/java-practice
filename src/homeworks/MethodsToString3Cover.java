package homeworks;

public class MethodsToString3Cover {

	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me") ) ; //java [me]thods
		System.out.println(coverString("java", "sql"));
	  }
	  
	  public static String coverString(String main, String coverME) {
		  String str = "";
		  String with = "["+coverME+"]";
		  if(main.contains(coverME)) {
			  str +=main.replaceAll(coverME, with);
			  
			  
		  }else if(!main.equals(coverME)) {
			  str +="["+main+"]";
	  }
		return str;
	    
	  

	}

}
