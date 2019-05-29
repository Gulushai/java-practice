package homeworks;

public class OOP9GasTant {

	public static void main(String[] args) {
		System.out.println("Hello world!");

	}
	public class GasTank {
		  //WRITE YOUR CODE HERE

		  double amount =0.0;
		  double capacity;

		  
//			A constructor that accepts a parameter of type double. 
//			The value of the parameter is used to initialize the value of capacity.
		  public GasTank(double capacity){
		    this.amount = capacity+amount;
		  }
		  
//			A method named addGas that accepts a parameter of type double. 
//			The value of the amount instance variable is increased by the value of the parameter. 
//			However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
		  public addGas(double num){
		    this.amount = amount-num;
		  }
		  
//			A method named useGas that accepts a parameter of type double. 
//			The value of the amount instance variable is decreased by the value of the parameter. 
//			However, if the value of amount is decreased below 0, amount is set to 0.
		  public useGas(double )
		  
//			A method named isEmpty that accepts no parameters. 
//			isEmpty returns a boolean value: true if the value of amount is less than 0.1, and false otherwise.
		  public boolean isEmpty(){
		    if(amount <0.1){
		      return true;
		    }return false;
		  }
//			A method named isFull that accepts no parameters. 
//			isFull returns a boolean value: true if the value of amount is 
//			greater than capacity-0.1, and false otherwise.
		  public boolean isFull(){
		    if(amount>capacity){
		      capacity -= 0.1;
		      return true;
		    }return false;
		  }
		  
//			A method named getGasLevel that accepts no parameters. 
//			getGasLevel returns the value of the amount instance variable.
		  public double getGasLevel(){
		    
		  }
		  
//			A method named fillUp that accepts no parameters. 
//			fillUp increases amount to capacity and returns the difference 
//			between the value of capacity and the original value of amount 
//			(that is, the amount of gas that is needed to fill the tank to capacity).
		  double diff = 0;
		  public double fillUp(){
		    amount = amount+capacity;
		    diff = amount-capacity;
		    return diff;
		    return amount;
		  }
		
	}
}
