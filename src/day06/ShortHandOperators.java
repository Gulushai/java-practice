package day06;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int students = 45;
		System.out.println("students: " + students);
		students = students + 5;
		System.out.println("students: " + students);
		students = students - 2;
		System.out.println("students: " + students);
		
		int teachers = 10;
		System.out.println("teachers: "+ teachers);
		teachers +=2;
		System.out.println("Teachers: " + teachers);
		teachers-=5;
		System.out.println("Teachers: " + teachers);
		
		int cars = 12;
		System.out.println("Cars "+ cars);
		cars *= 2;
		System.out.println("Cars: " + cars);
		cars +=cars;
		System.out.println("cars: " + cars);
		
		int shoes = 20;
		shoes /=4;
		System.out.println("shoes: " + shoes);
		
		double price = 45.50;
		int amount = 5;
		price += amount;
		System.out.println(price);
		
		int minutes = 66;
		minutes %=60;
		System.out.println("Remaining : " + minutes);
		
		int pennies = 550;
		pennies %=100;
		System.out.println("Pennies left: " + pennies);
	}

}
