package day53_Inheritance;

public class Capital extends City{
	
	private long population;
	public int count = 1;
	
	public Capital(int id, String name, long population) {
		super(id, name);
		this.population = population;
	}
	
//	public void letsBuildARoad() { // non static method can call static method
//		buildARoad();
//	}
	
	public static void buildARoad() {
		System.out.println("Capital City -  building a road");
	}
	
	
	@Override
	public String toString() {
		return super.toString()+", population: "+ population +" count Cap: "+count;
	}
	
	public void displayCount() {
		System.out.println("City count: "+super.count);
		System.out.println("Capital count: "+ count);
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
}
