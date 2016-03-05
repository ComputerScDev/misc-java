// superclass

public class Bicycle {
	
	private int numGears;
	private double price;
	private String suspension;
	
	public Bicycle() {
		this.numGears = 0;
		this.price = 0.0;
	}
	
	public double getPrice() { return this.price; }
	public void setPrice(double price) { this.price = price; }
	public int getGears() { return this.numGears; }
	public void setGears(int numGears) { this.numGears = numGears; }
	public String getSuspension() { return this.suspension; }
	public void setSuspension(String s) { this.suspension = s; }
	
	public void rideTheMountain() {
		System.out.println("Popped a tire.");
	}
}
