package day52_Inheritance;

public class Computer {
	private String model;
	private String color;
	
	
	public Computer() {
		super();
		
	}
	public Computer(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public boolean equals(Object other) {
		//cast/convert to car
		Computer that = (Computer) other;
		if(this.model.equals(that.model) && 
		   this.color.equals(that.color)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
}
