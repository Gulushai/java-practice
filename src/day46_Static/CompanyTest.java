package day46_Static;

public class CompanyTest {

	public static void main(String[] args) {
		
		System.out.println("Company name "+ Company.cname);
		System.out.println(Company.cname.toUpperCase());
		
		Company c = new Company();
		System.out.println(c.cname);
		c.companyInfo();
		Company.companyInfo();
		System.out.println(Math.round(455.6322));
	}

}
