//	MyDate model class
//	-year:int
//	-month:int
//	-day:int
//	-strMonths:String[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}
//	-strDays:String[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}
//	-daysInMonths:int[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
//	+MyDate(year:int, month:int, day:int)
//	+getYear():int
//	+getMonth():int
//	+getDay():int
//	+getDayOfWeek(year:int, month:int, day:int):int
//	+setYear(year:int):void
//	+setMonth(month:int):void
//	+setDay(day:int):void
//	+setDate(year:int, month:int, day:int):void
//	+toString():String
//	+nextDay():MyDate
//	+nextMonth():MyDate
//	+nextYear():MyDate
//	+lastDay():MyDate
//	+lastMonth():MyDate
//	+lastYear():MyDate
//	+isLeapYear(year:int):boolean
//	+isValidDate(year:int, month:int, day:int):boolean

public class MyDate {
	
	//	private member fields (variables)
	private int year;
	private int month;
	private int day;
	private String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//	constructor
	public MyDate(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	
	//	getters
	//	+getYear():int
	public int getYear() {
		return this.year;
	}
	
	//	+getMonth():int
	public int getMonth() {
		return this.month;
	}
	
	//	+getDay():int
	public int getDay() {
		return this.day;
	}
	
	//	+getDayOfWeek(year:int, month:int, day:int):int
	public int getDayOfWeek(int year, int month, int day) {
		if (!isValidDate(year, month, day)) {
			throw new IllegalStateException("invalid date argument");
		}
		
		int[] MonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		int[] MonthNumbersLeap = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		int centuryNumber = 6 - 2*((year / 100) % 4);
		int monthNumber = isLeapYear(year) ? MonthNumbersLeap[month - 1] : MonthNumbers[month - 1];
		
		return ((centuryNumber + (year % 100) + ((year % 100) / 4) + monthNumber + day) % 7);
	}
	
	//	setters
	//	+setYear(year:int):void
	public void setYear(int year) {
		if (year < 1 || year > 9999) {
			throw new IllegalArgumentException("invalid year argument");
		}
		
		this.year = year;
	}
	
	//	+setMonth(month:int):void
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("invalid month argument");
		}
		
		this.month = month;
	}
	
	//	helper method
	public int getUpperBound(int month) {
		int upperBound = 0;
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
				upperBound = 31;
				break;
			}
			case 4: case 6: case 9: case 11: {
				upperBound = 30;
				break;
			}
			case 2: {
				if (this.isLeapYear(this.getYear()) == true) {
					upperBound = 29;
				} else {
					upperBound = 28;
				}
				break;
			}
		}
		
		return upperBound;
	}
	
	//	+setDay(day:int):void
	public void setDay(int day) {
		int upperBound = this.getUpperBound(this.getMonth());
		
		if (day > upperBound || day < 1) {
			throw new IllegalArgumentException("invalid day argument");
		}
		
		this.day = day;
	}
	
	//	+setDate(year:int, month:int, day:int):void
	public void setDate(int year, int month, int day) {
		
		if (!isValidDate(year, month, day)) {
			throw new IllegalArgumentException("invalid date argument");
		}
		
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	
	//	+toString():String
	//	returns "xxxday d  mmm yyyy"
	public String toString() {
		return this.strDays[this.getDayOfWeek(this.getYear(), this.getMonth(), this.getDay())] + " " + this.getDay() + " " + this.strMonths[this.getMonth()-1] + " " + this.getYear();
	}
	
	//	helper method
	public MyDate newDate() {
		return new MyDate(this.getYear(), this.getMonth(), this.getDay());
	}
	
	//	+nextDay():MyDate
	public MyDate nextDay() {
		//MyDate newDate = this.newDate();
		int day = this.getDay();
		day++;
		
		if (day > this.getUpperBound(this.getMonth())) {
			day = 1;
			this.setMonth(this.nextMonth().getMonth());
		}
		
		this.setDay(day);
		return this;
	}
	
	//	+nextMonth():MyDate
	public MyDate nextMonth() {
		//MyDate newDate = this.newDate();
		int month = this.getMonth();
		month++;
		
		if (month > 12) {
			month = 1;
			this.setYear(this.nextYear().getYear());
		}
		
		if ((this.getDay() == this.getUpperBound(month)) && (this.getUpperBound(month) > this.getUpperBound(month + 1))) {
			this.setDay(this.getUpperBound(month + 1));
		}
		
		this.setMonth(month);
		return this;
	}
	
	//	+nextYear():MyDate
	public MyDate nextYear() {
		//MyDate newDate = this.newDate();
		
		if (this.isLeapYear(this.getYear()) && (this.getMonth() == 2) && (this.getDay() == this.getUpperBound(2))) {
			this.setDay(this.getUpperBound(2) - 1);
		}
		
		this.setYear(this.getYear() + 1);
		return this;
	}
	
	//	+lastDay():MyDate
	public MyDate lastDay() {
		//MyDate newDate = this.newDate();
		int day = this.getDay();
		day--;
		
		if (day < 1) {
			this.setMonth(this.lastMonth().getMonth());
			day = this.getUpperBound(this.getMonth());
		}
		
		this.setDay(day);
		return this;
	}
	
	//	+lastMonth():MyDate
	public MyDate lastMonth() {
		//MyDate newDate = this.newDate();
		int month = this.getMonth();
		month--;
		
		if (month < 1) {
			month = 12;
			this.setYear(this.lastYear().getYear());
		}
		
		if (this.getDay() > this.getUpperBound(month)) {
			this.setDay(this.getUpperBound(month));
		}
		
		this.setMonth(month);
		return this;
	}
	
	//	+lastYear():MyDate
	public MyDate lastYear() {
		//MyDate newDate = this.newDate();
		int year = this.getYear();
		year--;
		
		if (year < 1 || year > 9999) {
			throw new IllegalStateException("invalid year");
		}
		
		if ((this.getMonth() == 2) && (this.getDay() == this.getUpperBound(2))) {
			if (this.isLeapYear(year)) {
				this.setDay(29);
			} else {
				this.setDay(28);
			}
		}
		
		this.setYear(year);
		return this;
	}
	
	//	+isLeapYear(year:int):boolean
	public boolean isLeapYear(int year) {
		if ((((year % 4) == 0) && (year % 100 != 0)) || ((year % 400) == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	//	+isValidDate(year:int, month:int, day:int):boolean
	public boolean isValidDate(int year, int month, int day) {
		if (year < 1 || year > 9999) {
			return false;
		} else if (month < 1 || month > 12) {
			return false;
		} else if (day < 1 || day > this.getUpperBound(month)) {
			return false;
		}
		
		return true;
	}
}
