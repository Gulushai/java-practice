package day50_Inheritence;

public class SlackUser {
	private String name;
	public SlackUser(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sendAMessage(String message) {
		System.out.println(name +" is sending a Message <"+message+">");
	}
}
