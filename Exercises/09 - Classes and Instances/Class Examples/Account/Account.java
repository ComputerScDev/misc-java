// Account model class

// Class 3-tuple:
// Name : Account
// ----------------
// Static attributes:
// ----------------
// -accountNumber:int
// -balance:double = 0.0
// ----------------
// Dynamic behaviors:
// ----------------
// +Account(accountNumber:int, balance:double)
// +Account(accountNumber:int)
// +getAccountNumber():int
// +getBalance():int
// +setBalance(balance:double):void
// +credit(amount:double):void
// +debit(amount:double):void
// +toString():String

public class Account {
	
	// private member fields (variables)
	private int accountNumber;
	private double balance;
	
	// overloaded constructors
	// first
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// second
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		balance = 0;
	}
	
	// public getters and setters for private variables
	// getters
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// setter
	// notice no setter for accountNumber
	// once we create an account with an accountNumber,
	// we can't change its identifier (account number)
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// public methods
	// credits account with some input amount
	public void credit(double amount) {
		balance += amount;
	}
	
	// debits account of some input amount
	public void debit(double amount) {
		if (balance < amount) {
			System.out.println("Amount withdrawn exceeds current balance.");
		} else {
			balance -= amount;
		}
	}
	
	// public toString() for object/instance description
	public String toString() {
		return String.format("A/C no: %d Balance = %.2f", accountNumber, balance);
	}
}
