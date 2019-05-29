package day45_EncapsulationPractice;

public class EtsyDotCom {

	public static void main(String[] args) {
		EtsyAccount acct1 = new EtsyAccount();
		System.out.println(acct1.toString());
		acct1.setEmail("pdfas@gmail.com");
		acct1.setFirstName("Pumev");
		acct1.setPassword("bulgaria123");
		
		System.out.println(acct1.toString());
		
		EtsyAccount acct2 = new EtsyAccount();
		acct2.setEmail("ffffgmail.com");
		acct2.setFirstName("ffff123");
		acct2.setPassword("asdfg");
		System.out.println(acct2.toString());
		
		EtsyAccount acct3 = new EtsyAccount("helireva@info.com","Helireva", "dsfasd23");
		System.out.println(acct3.toString());
		
		EtsyAccount acct4 = new EtsyAccount("helireva@info.com","Helireva");
		System.out.println(acct4.toString());
		//final String ="h21wrp"; final - password cannot be changed
		
	}

}
