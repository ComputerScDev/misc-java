// subclass 'MountainBike'

public class MountainBike extends Bicycle {
	
	private String suspension;
	private double trailRating;
	
	public MountainBike() {
		super(); // calls superclass constructor
		this.suspension = "Downhill";
		this.trailRating = 2;
	}
	
	public double getTrailRating() { return this.trailRating; }
	public void setTrailRating(double t) { this.trailRating = t; }
	public String getSuspension() { return this.suspension; }
	public void setSuspension(String s) { this.suspension = s; }
	
	@Override // indicates that this method overrides the superclass
	public void rideTheMountain() {
		System.out.println("All systems w/in normal operating parameters.");
	}
}
