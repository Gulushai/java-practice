package day11_nestedif;

public class LogicalBooleanValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = 50>10 && 10>100;
		System.out.println("b1: " +b1); //false
		
		boolean b2 = 'a' == 'a' && 123 >120;
		System.out.println("B1: " + b2);//true
		
		boolean b3 = true && 10>=10 && 1000<=900;
		System.out.println("B3: " + b3);//false
		
		boolean b4 = false && false  && 10 == 10;
		System.out.println("B4: " + b4);// false
		
		boolean b5 = false && true  && 10 == 10;
		System.out.println("B5: " + b5);// false
		
		boolean b6 = false || true  && 10 == 10;
		System.out.println("B5: " + b6);// true
		
		boolean b7 = false && true  || 10 == 10;
		System.out.println("B5: " + b7);// true
		
		boolean b8 = false && true  || 10 != 10;
		System.out.println("B8: " + b8);//false
		
		boolean b9 = true && true  || 10 != 10;
		System.out.println("B9: " + b9);// true
		
		boolean b10 = true;
		boolean b11 = true;
		boolean everythingIsClear = true && !false;
		boolean letsGoForABreak = b10 && b11 && everythingIsClear;
		System.out.println("lets go for a break " + letsGoForABreak);
		
		boolean b12 = !true || true && false;
		System.out.println("B12: " + b12);// false
	}

}
