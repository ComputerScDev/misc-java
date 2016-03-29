import java.util.*;

//	Book model class pt. II
//	handles the case for multiple authors
//	-name:String
//	-authors:List<Author> = new ArrayList<Author>
//	-numAuthors:int = 0
//	-price:double
//	-qtyInStock:int = 0
//	+Book(name:String, price:double)
//	+Book(name:String, price:double, qtyInStock:int)
//	+getName():String
//	+getAuthors():Author[]
//	+getPrice():double
//	+getQtyInStock():int
//	+setPrice(price:double):void
//	+setQtyInStock(qtyInStock:int):void
//	+toString():String
//	+printAuthors():void
//	+addAuthor(author:Author):void

public class Book {	
	
	// private member fields (variables)
	private String name;
	private List<Author> authors = new ArrayList<Author>();
	//private Author[] authors = new Author[5];
	private int numAuthors = 0;
	private double price;
	private int qtyInStock = 0;
	
	// public constructors
	//	+Book(name:String, price:double)
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//	+Book(name:String, price:double, qtyInStock:int)
	public Book(String name, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	//	public getters for private variables
	//	+getName():String
	public String getName() {
		return name;
	}
	
	//	+getAuthors():Author[]
	public List<Author> getAuthors() {
		return authors;
	}
	
	//	+getPrice():double
	public double getPrice() {
		return price;
	}
	
	//	+getQtyInStock():int
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	//	public setters for price and quantity
	//	+setPrice(price:double):void
	public void setPrice(double price) {
		this.price = price;
	}
	
	//	+setQtyInStock(qtyInStock:int):void
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	//	public toString() method
	//	+toString():String
	public String toString() {
		return ("'" + this.name + "' by " + authors.size() + " authors.");
	}
	
	//	+printAuthors():void
	public void printAuthors() {
		for (Author a : this.authors) {
			System.out.println(a);
		}
	}
	
	//	+addAuthor(author:Author):void
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	//	exercise
	//	method that removes author from this Book instance
	//	if 'authorName' is present. returns true if it succeeds
	//	+removeAuthorByName(authorName:String):boolean
	public boolean removeAuthorByName(String authorName) {
		for (Author a : this.authors) {
			if (a.getName() == authorName) {
				this.authors.remove(a);
				return true;
			}
		}
		return false;
	}
}
