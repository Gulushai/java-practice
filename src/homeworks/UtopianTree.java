package homeworks;

public class UtopianTree {

	public static void main(String[] args) {
		
		int tree=0;
		int cm=1;
		for(int i=1; i<=10; i++) {
			if(i-3>0) {
			cm=2;	
			} 
			tree+=cm;
		System.out.println("year " +i + " - growth "+cm+"cm");
		System.out.println("tree size: "+tree+"cm");
		}	
		
		
	}

}
