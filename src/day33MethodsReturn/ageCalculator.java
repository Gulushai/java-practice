package day33MethodsReturn;

public class ageCalculator {

	public static void main(String[] args) {
		int age = calculateAge(2000);
		System.out.println("You are "+age+ " years old");
		int age1 = calculateAge(1986);
		System.out.println("You are "+age1+ " years old");
		int age2 = calculateAge(2018);
		System.out.println("You are "+age2+ " years old");
		int age3 = calculateAge(1800);
		System.out.println("You are "+age3+ " years old");
		int age4 =calculateAge(2020);
		System.out.println("You are "+age4+ " years old");
		
		System.out.println(calculateAge(2007));

	}
	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear-year;
		if(age<=0) {
			System.out.println("Invalid age");
			return 0;
		}else if(age>=1 && age<=14) {
			System.out.println("Child ");
		}else if(age>=15 && age<=25) {
			System.out.println("Youngster ");
		}else if(age>=26 && age<=64) {
			System.out.println("Adult ");
		}else if(age>=65) {
			System.out.println("Senior ");
		}
		
		return age;
	}

}
