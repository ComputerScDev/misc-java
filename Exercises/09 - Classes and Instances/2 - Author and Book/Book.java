//	Book model class
//	-name:String
//	-author:Author
//	-price:double
//	-qtyInStock:int = 0
//	+Book(name:String, author:Author, price:double)
//	+Book(name:String, author:Author, price:double, qtyInStock:int)
//	+getName():String
//	+getAuthor():Author
//	+getPrice():double
//	+getQtyInStock():int
//	+setPrice(price:double):void
//	+setQtyInStock(qtyInStock:int):void

public class Book {	
	
	// private member fields (variables)
	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;
	
	// public constructors
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	// public getters for private variables
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	// public setters for price and quantity
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	// public toString() method
	public String toString() {
		return ("'" + this.name + "' by " + this.author + ".");
	}
	
	// New methods exercise: add getAuthorName(), getAuthorEmail(), getAuthorGender()
	public String getAuthorName() {
		return this.getAuthor().getName();
	}
	
	public String getAuthorEmail() {
		return this.getAuthor().getEmail();
	}
	
	public char getAuthorGender() {
		return this.getAuthor().getGender();
	}
}
