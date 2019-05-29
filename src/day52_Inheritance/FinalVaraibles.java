package day52_Inheritance;

public class FinalVaraibles {

	public final int ROADSTER_MAX_RANGE;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	
	public static final String COMPANY_NAME = "Cyberetek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";
		COMPANY_NAME = "CybertekSchool";
	}
	
	public FinalVariables(int max) {
		ROADSTER_MAX_RANGE = max;
		ADMIN_USERNAME = "admin";
	}
	/*
	public FinalVariables() {
		ROADSTER_MAX_RANGE = 610;
	}
	*/
	{
		MODEL_X_PASSENGERS;//init blocks
	}
	public static void main(String[] args) {
		final int MAX_PASSENGER_COUNT = 5;
		//MAX PASSENGER count = 10:
		final double PI = 3.14;
		//PI = 4.667885432;
		System.out.println(MAX_PASSENGER_COUNT);
		
		final int SSN;
		//code
		SSN = 314569841;
		//SSN++; is not possible
		FinalVaraibles finalVars = new FinalVaraibles();
		System.out.println("Max range for roadster: "+ finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 Max speed: "+finalVars.MODEL_3_MAX_SPEED);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("Compay name "+ company_name);
		System.out.println("Company name " + fianlVariables.Company_name);
		

		
	}

}
