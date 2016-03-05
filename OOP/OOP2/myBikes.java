// bikes inheritance demo

public class myBikes {
	
	public static void main(String[] args) {
		Bicycle Bike = new Bicycle();
		MountainBike MtnBike = new MountainBike();
		RoadBike RdBike = new RoadBike();
		TandemBike TdmBike = new TandemBike(4);
		
		Bike.setPrice(250);
		MtnBike.setPrice(375);
		MtnBike.setSuspension("Hard tail");
		Bike.setSuspension("Hard tail");
		TdmBike.setSuspension("Hard tail");
		
		Bike.rideTheMountain();
		MtnBike.rideTheMountain();
		RdBike.rideTheMountain();
		TdmBike.rideTheMountain();
	}
}
