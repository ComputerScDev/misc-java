// subclass 'TandemBike'

public class TandemBike extends Bicycle {
	
	private int nRiders;
	
	public TandemBike() {
		super();
		this.nRiders = 2;
	}
	
	public TandemBike(int n) {
		super();
		this.setNRiders(n);
	}
	
	public int getNRiders() { return this.nRiders; }
	public void setNRiders(int n) { this.nRiders = n; }
	
	@Override
	public void rideTheMountain() {
		System.out.println(this.nRiders + " people stuck in a ditch.");
	}
}
