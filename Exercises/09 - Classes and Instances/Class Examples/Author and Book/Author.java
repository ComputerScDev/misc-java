// Author model class

// Class 3-tuple:
// Name : Author
// ----------------
// Static attributes:
// ----------------
// -name:String
// -email:String
// -gender:char
// ----------------
// Dynamic behaviors:
// ----------------
// +Author(name:String, email:String, gender:char)
// +getName():String
// +getEmail():String
// +getGender():char
// +setEmail(email:String):void
// +toString: String

public class Author {
	
	// private member fields (variables)
	private String name;
	private String email;
	private char gender;
	
	// constructor
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	// public getters and setters for private variables
	// getters
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	
	// setter
	// only one setter, for email field
	public void setEmail(String email) {
		this.email = email;
	}
	
	// public toString() for object/instance description
	public String toString() {
		return name + " (" + gender + ") at " + email + ".";
	}
}
