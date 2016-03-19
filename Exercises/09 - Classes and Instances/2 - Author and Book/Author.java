// Author model class
//	-name:String
//	-email:String
//	-gender:char
//	+Author(name:String, email:String, gender:char)
//	+getName():String
//	+setEmail(email:String):void
//	+getGender():char
//	+toString():String

public class Author {
	
	// private member fields (variables)
	private String name;
	private String email;
	private char gender;
	
	// public constructor
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	// public getter for private variables
	// getter for name
	public String getName() {
		return this.name;
	}
	
	// getter for gender
	public char getGender() {
		return this.gender;
	}
	
	// getter for email
	public String getEmail() {
		return this.email;
	}
	
	// public setters for private variables
	public void setEmail(String email) {
		this.email = email;
	}
	
	// public toString() method
	// must return "author-name (gender) at email"
	public String toString() {
		return (this.getName() + "(" + this.getGender() + ") at " + this.getEmail());
	}
}
