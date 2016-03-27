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
		this.hour = hour;
	}
	
	//	+setMinute(minute:int):void
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	//	+setSecond(second:int):void
	public void setSecond(int second) {
		this.second = second;
	}
	
	//	+setTime(hour:int, minute:int, second:int):void
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//	+toString():String
	//	+nextHour():MyTime
	//	+nextMinute():MyTime
	//	+nextSecond():MyTime
	//	+lastHour():MyTime
	//	+lastMinute():MyTime
	//	+lastSecond():MyTime
	
}