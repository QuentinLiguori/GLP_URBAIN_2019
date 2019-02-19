package chrono;

/**
 * The chronometer class is composed of the three cyclic counters. We can count until 23 hours 59 minutes and 59
 * seconds.
 * 
 * @author Tianxiao.Liu@u-cergy.fr
 **/
public class Chronometer {
	private CyclicCounter day = new CyclicCounter(0, 6, 0);
	private CyclicCounter hour = new CyclicCounter(0, 23, 0);
	private CyclicCounter minute = new CyclicCounter(0, 59, 0);
	private CyclicCounter second = new CyclicCounter(0, 59, 0);
	
	public void increment() {
		second.increment();
		if (second.getValue() == 0) {
			minute.increment();
			if (minute.getValue() == 0) {
				hour.increment();			
				if (hour.getValue() == 0) {
					day.increment();
				}
			}
		}
	}

	public void decrement() {
		second.decrement();
		if (second.getValue() == 59) {
			minute.decrement();
			if (minute.getValue() == 59) {
				hour.decrement();
			}
		}
	}

	public CyclicCounter getDay() {
		return day;
	}
	
	public CyclicCounter getHour() {
		return hour;
	}

	public CyclicCounter getMinute() {
		return minute;
	}

	public CyclicCounter getSecond() {
		return second;
	}

	public String toString() {
		String result = "";
		result = hour.toString() + " : " + minute.toString() + " : " + second.toString();
		return result;
	}

	public static String transform(int value) {
		String result = "";
		if (value < 10) {
			result = "0" + value;
		} else {
			result = String.valueOf(value);
		}
		return result;
	}

	public void init() {
		day.setValue(0);
		hour.setValue(0);
		minute.setValue(0);
		second.setValue(0);
	}

}