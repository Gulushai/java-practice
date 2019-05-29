package CodingBat;

public class FirstAndLastLetters {

	public static void main(String[] args) {
		String str = "coding java python";
		String first ="";
		  String last = "";
		  String newStr = "";
		  if(str.length()<=1){
		    System.out.println(str);
		  }else if(str.length()>1){
		    first = str.substring(0, 1);
		    last = str.substring(str.length()-1);
		    newStr = str.substring(1, str.length()-1);
		  }
		  System.out.println(last+newStr+first);
		
		  int maxLength =3;
		  System.out.println(str.substring(0, (str.length()-maxLength)));

		  String str2 = "java";
		  if(str.contains(str2)) {
		  System.out.println(str.replace(str2, ""));
		  }
	}

}
