// MyTime model class

// Class 3-tuple:
// Name : MyTime
// ----------------
// Static attributes:
// ----------------
// -hour:int = 0
// -minute:int = 0
// -second:int = 0
// ----------------
// Dynamic behaviors:
// ----------------
// +MyTime(hour:int, minute:int, second:int)
// +getHour():int
// +getMinute():int
// +getSecond():int
// +setTime(hour:int, minute:int, second:int):void
// +setHour(hour:int):void
// +setMinute(minute:int):void
// +setSecond(second:int):void
// +toString():String
// +nextSecond():MyTime
// +nextMinute():MyTime
// +nextHour():MyTime
// +previousSecond():MyTime
// +previousMinute():MyTime
// +previousHour():MyTime

public class MyTime {
	
	// private member fields (variables)
	private int hour;	// 0-23
	private int minute;	// 0-59
	private int second;	// 0-59
	
	// constructor
	public MyTime(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	// public getters and setters for private variables
	// main setter
	void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	// setters which validates input with exception handling
	void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		} else {
			throw new IllegalArgumentException("Invalid hour!");
		}
	}
	
	void setMinute(int minute) {
		if (minute >= 0 && second <= 59) {
			this.second = second;
		} else {
			throw new IllegalArgumentException("Invalid minute!");
		}
	}
	
	void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		} else {
			throw new IllegalArgumentException("Invalid second!");
		}
	}
	
	// getters
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	// public toString() for object/instance description
	// return description in the format "hh:mm:ss" with leading zeros
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	// public methods
	// nextSecond(): increment this instance object to the next second, and return this instance
	public MyTime nextSecond() {
		++second;
		if (second == 60) {
			second = 0;
			++minute;
		}
		if (minute == 60) {
			minute = 0;
			++hour;
		}
		if (hour == 24) {
			hour = 0;
		}
		return this;	// return this instance, to support cascaded operation
	}
}
