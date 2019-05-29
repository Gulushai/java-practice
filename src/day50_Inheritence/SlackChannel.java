package day50_Inheritence;

public class SlackChannel {

	public static void main(String[] args) {
		SlackUser su = new SlackUser("Nadir");
		AdminUser au = new AdminUser("Florian");
		
		su.sendAMessage("Nadirs message about Jira");
		au.sendAMessage("Thank you.");
	}

}
