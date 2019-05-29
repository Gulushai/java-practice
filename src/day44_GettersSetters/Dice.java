package day44_GettersSetters;

import java.util.ArrayList;

public class Dice {

	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("Java Developer");
		Job job3 = new Job("SDET", "Amazon", 130_000.0);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		//Create a list of jobs and add 5 different jobs, with company, Salary and title
		
		Job dice = new Job("Senior Software Engineer in Test", "CoStar", 100_000.0);
		ArrayList<Job> Dice = new ArrayList<>();
		Dice.add(job3);
		Dice.add(new Job("Scrum Master", "Google", 133_000));
		Dice.add(new Job("SDET", "FreddieMac", 110_000));
		Dice.add(new Job("BA", "Leidos", 98_000));
		Dice.add(new Job("Developer", "Delta", 150_000));
		
		System.out.println(Dice.toString());
		
		//find the highest paying job and print toString for that
		double maxSalary =0;
		//int highestIndex = -1;
		for(int i=0; i<Dice.size(); i++) {
			if(Dice.get(i).getAnnualSalary()>maxSalary) {
				maxSalary = Dice.get(i).getAnnualSalary();
				//highestIndex = i;
			}
		}
		System.out.println("Highest Salary: "+maxSalary);
		//System.out.println("Highest Salary: "+Dice.get(highestIndex));
	}

}
