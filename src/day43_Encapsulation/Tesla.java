package day43_Encapsulation;

public class Tesla {
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}
	public void setModel(String model) {
		//call isValidModel here then assign if true
		//if false:  Invalid model -Camry
		//assign 'unknown' to model
				
		//this.model = isValidModel(model) ? model : "Invalid model";
		
		if(isValidModel(model) == true) {
			System.out.println();
			this.model = model;
		}else {
			System.out.println("Invalid model ");
			this.model = "unknown";
		}

	}
	public String getModel() {
		return model;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getRange() {
		return range;
	}
	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	public double getZeroTo60() {
		return zeroTo60;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	public boolean isSelfDriving() {
		return selfDriving;
	}
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}
	
	public boolean isValidModel(String model) {
		model = model.toLowerCase();
//		if(model1.equals("model s") || model.equals("model 3") || 
//				model.equals("model x") || model.equals("model y") || 
//				model.equals("roadster")) {
//		return true;
//	}
//	return false;
//	}
		
//		return model1.equals("model s") || 
//				model.equals("model 3") || 
//				model.equals("model x") || 
//				model.equals("model y") || 
//				model.equals("roadster");
		switch(model) {
		case "model s":
		case "model 3":
		case "model x":
		case "model y":
		case "roadster":
			return true;
			default:
				return false;
		}
}
	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		//call setter method for each parameter
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
		
	}
}
