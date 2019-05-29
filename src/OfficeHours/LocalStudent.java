package OfficeHours;

public class LocalStudent extends Student{
	protected int seatID;
	
	public void attendClassInPerson() {
		System.out.println("Valid message");
	}
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	public int getSeatId() {
		return seatID;
	}
}
