package day51_Inheritance;

public class AtTheGym {

	public static void main(String[] args) {
		Exercise ex = new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JiuJitsu j = new JiuJitsu();
		Snowboarding sn = new Snowboarding();
		
		System.out.println(ex.perform(30));
		System.out.println(r.perform(30));
		System.out.println(s.perform(30));
		System.out.println(y.perform(30));
		System.out.println(j.perform(30));
		System.out.println("________________________________");
		System.out.println(sn.perform(200));

	}
}
