package CodingBat;

public class backAround {

	public static void main(String[] args) {
		String last = "";
		String str = "cat";
		if(str.length()<=1) {
			System.out.println(str+str+str);
		}else if(str.length()>1) {
			last = str.substring(str.length()-1);
			str = last+str+last;
		}
		System.out.println(str);
	}

}
