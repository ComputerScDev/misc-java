//	Person model superclass
//	-name:String
//	-address:String
//	+Person(name:String, address:String)
//	+getName():String
//	+getAddress():String
//	+setAddress(address:String):void
//	+toString():String

public class Person {
	
	private String name;
	private String address;
	
	//	+Person(name:String, address:String)
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	//	+getName():String
	public String getName() {
		return name;
	}
	
	//	+getAddress():String
	public String getAddress() {
		return address;
	}
	
	//	+setAddress(address:String):void
	public void setAddress(String address) {
		this.address = address;
	}
	
	//	+toString():String
	public String toString() {
		return name + " (" + address ").";
	}
}
