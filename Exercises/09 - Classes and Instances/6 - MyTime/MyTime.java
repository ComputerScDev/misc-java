//	MyTime model class
//	-hour:int = 0
//	-minute:int = 0
//	-second:int = 0
//	+MyTime(hour:int, minute:int, second:int)
//	+getHour():int
//	+getMinute():int
//	+getSecond():int
//	+setHour(hour:int):void
//	+setMinute(minute:int):void
//	+setSecond(second:int):void
//	+setTime(hour:int, minute:int, second:int):void
//	+toString():String
//	+nextHour():MyTime
//	+nextMinute():MyTime
//	+nextSecond():MyTime
//	+lastHour():MyTime
//	+lastMinute():MyTime
//	+lastSecond():MyTime

public class MyTime {
	
	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	//	+MyTime(hour:int, minute:int, second:int)
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//	+getHour():int
	public int getHour() {
		return this.hour;
	}
	
	//	+getMinute():int
	public int getMinute() {
		return this.minute;
	}
	
	//	+getSecond():int
	public int getSecond() {
		return this.second;
	}
	
	//	+setHour(hour:int):void
	public void setHour(int hour) {
		if (hour > 23 || hour < 0) {
			throw new IllegalArgumentException("invalid hour argument");
		}
		this.hour = hour;
	}
	
	//	+setMinute(minute:int):void
	public void setMinute(int minute) {
		if (minute > 59 || minute < 0) {
			throw new IllegalArgumentException("invalid minute argument");
		}
		this.minute = minute;
	}
	
	//	+setSecond(second:int):void
	public void setSecond(int second) {
		if (second > 59 || second < 0) {
			throw new IllegalArgumentException("invalid minute argument");
		}
		this.second = second;
	}
	
	//	+setTime(hour:int, minute:int, second:int):void
	public void setTime(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	
	//	+toString():String
	//	returns "HH:MM:SS"
	public String toString() {
		return (this.hour < 10? "0" + this.hour : this.hour) + 
		":" + (this.minute < 10? "0" + this.minute : this.minute) + 
		":" + (this.second < 10? "0" + this.second : this.second);
	}
	
	//	+nextHour():MyTime
	public MyTime nextHour() {
		int hour = this.getHour();
		hour++;
		if (hour%24 == 0) {
			hour = 0;
		}
		this.setHour(hour);
		return this;
	}
	
	//	+nextMinute():MyTime
	public MyTime nextMinute() {
		int minute = this.getMinute();
		minute++;
		if (minute%60 == 0) {
			minute = 0;
			this.setMinute(minute);
			this = this.nextHour();
		}
		this.setMinute(minute);
		return this;
	}
	
	//	+nextSecond():MyTime
	public MyTime nextSecond() {
		int second = this.getSecond();
		second++;
		if (second%60 == 0) {
			second = 0;
			this.setSecond(second);
			this = this.nextMinute();
		}
		this.setSecond(second);
		return this;
	}
	
	//	+lastHour():MyTime
	public MyTime lastHour() {
		int hour = this.getHour();
		hour--;
		if (hour == -1) {
			hour = 23;
		}
		this.setHour(hour);
		return this;
	}
	
	//	+lastMinute():MyTime
	public MyTime lastMinute() {
		int minute = this.getMinute();
		minute--;
		if (minute == -1) {
			minute = 59;
			this.setMinute(minute);
			this = this.lastHour();
		}
		this.setMinute(minute);
		return this;
	}
	
	//	+lastSecond():MyTime
	public MyTime nextSecond() {
		int second = this.getSecond();
		second--;
		if (second == -1) {
			second = 59;
			this.setSecond(second);
			this = this.lastMinute();
		}
		this.setSecond(second);
		return this;
	}
}
