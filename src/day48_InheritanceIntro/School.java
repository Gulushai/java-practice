package day48_InheritanceIntro;

public class School {

	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		p.name = "Obama";
		p.age = 57;
		p.gender = 'm';
		
		s.name = "Roman";
		s.age = 30;
		s.gender = 'm';
		
		p.eat("steak");
		s.eat("grechka");
		
		p.walk();
		s.walk();
		
		p.sleep(8);
		s.sleep(6);
		s.clazz = "Ping Pong";
		
		Student s2 = new Student();
		s2.name = "Orhan";
		s2.age = 40;
		s2.gender = 'm';
		s2.studentID = 4040;
		s2.clazz = "Agile Scrum";
		
		s2.code("Java");
		s2.attendClass();
		s2.eat("kebab");
		

	}

}
