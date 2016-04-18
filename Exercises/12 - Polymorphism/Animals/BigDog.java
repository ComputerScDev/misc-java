/**
* BigDog subclass of Dog subclass of abstract Animal superclass
*/

public class BigDog extends Dog {
	
	@Override
	public void greeting() {
		System.out.println("WAN");
	}
	
	@Override
	public void greeting(Dog another) {
		System.out.println("WAN WAN");
	}
	
	public void greeting(BigDog another) {
		System.out.println("WAN WAN WAN");
	}
}
