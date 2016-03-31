//	Book model class
//	assume a book (instance) is written only by one author
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
	private int qtyInStock;
	
	// overloaded constructors
	// first
	public Book (String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = 0;
	}
	
	// second
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	// public getters and setters for private variables
	// getters
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;	// return member field author, which is an instance of class Author
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	// setters
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	// public toString() for object/instance description
	public String toString() {
		return "'" + name + "' by " + author + ".";	// author.toString()
	}
}
