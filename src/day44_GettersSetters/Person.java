package day44_GettersSetters;

public class Person {
	private String firstName;
	private String lastName;
	private String birthday;

	
	public Person(String bDay) {
		System.out.println("constructing ");
		birthday = bDay;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	
	//we will not have public set birthday method people should not be able 
//	public void setBirthday(String birthday) {
//		this.birthday = birthday;
//	}
	
	
}
