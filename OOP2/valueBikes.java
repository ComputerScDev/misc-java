public class valueBikes {
	
	public static void main(String[] args) {
		MountainBike MtnBike = new MountainBike();
		MtnBike.setPrice(405);
		MtnBike.setTrailRating(2.5);
		
		if (MtnBike.isGoodValue()) {
			System.out.println("Good value!");
		} else {
			System.out.println("Bad value!");
		}
	}
}
