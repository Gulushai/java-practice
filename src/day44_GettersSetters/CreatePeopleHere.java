package day44_GettersSetters;

public class CreatePeopleHere {

	public static void main(String[] args) {
		Person john = new Person("01/01/2000");
		System.out.println(john.getBirthday());
		john.setFirstName("John");
		john.setLastName("Doe");
		
		
		System.out.println(john.getFirstName());
		System.out.println(john.getLastName());
		System.out.println(john.getBirthday());
		
		john.setFirstName("Melinda");
		john.setLastName("Smith");
		
	}

}
