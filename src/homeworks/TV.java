package homeworks;

public class TV {
	
	 public static void main(String[] args) {
			TV tv1 = new TV();
			tv1.setVolumeLevel((70));
			System.out.println(tv1.getVolumLevel());
			
			String str = "arary";
			String word = "";
			if(str.charAt(0)=='a') {
				word = 'a'+str.substring(2);
			}System.out.println(word);
		}
	  int channel=1;
	  int volumeLevel=1;
	  boolean on = false;
	  String brand = "undefined";
	
	 
	  public  void channelUp(){
	    channel++;
	  }
	  public  void channelDown(){
	    channel--;
	  }
	  public  void volumeUp(){
	    volumeLevel++;
	  }
	  public  void volumeDown(){
	    volumeLevel--;
	  }
	  public boolean isOn(){
	    return this.on;
	  }
	  public void turnOn(){
		  if(on ==true) {
			  System.out.println("TV is already ON");
		  }else {
			  this.on=true;
		  }
	    
	  }
	  public void turnOff(){
		  if(on == false) {
	    System.out.println("TV is already OFF");
		  }else {
			  this.on=false;
		  }
	  }
	  
	  public TV(){
	    System.out.println("Creating TV object using noArgs - constructor");
	  }
	  public TV(String brand){
	    System.out.println("Creating TV object using 1 arg - constructor");
	  }
	  public int getVolumLevel(){
	    return volumeLevel;
	  }
	  
	  public void setVolumeLevel(int volumeLevel){
		  if(volumeLevel<=0 || volumeLevel>7) {
			  System.out.println("ERROR: TV is either OFF or invalid Volume level");
		  }else {
			  this.volumeLevel = volumeLevel;
		  }
		  
	  }
	  public int getChannel(){
	    
	    return channel;
	  }
	  public void setChannel(int channel){
		  if(channel<=0 || channel>120) {
		    	System.out.println("ERROR: TV is either OFF or invalid Channel");
		    }else {
		    	this.channel=channel;
		    }
	  }
	  public String getBrand(){
	    return brand;
	  }
	  public void setBrand(String brand){
	    this.brand = brand;
	  }
	  
}
