package studio8;


public class Time {
	private int hour;
	private int minute;
	private boolean format;
	/**
	 * 
	 * @param hour integer from 0-23
	 * @param minute integer from 0 to 59
	 * @param format boolean on whether 12-hour or 24-hour
	 */
	public Time (int hour, int minute, boolean format) {
		this.hour = hour;
		this.minute = minute;
		this.format = format;
		
	}
	
	public String toString() {
		String time = this.hour + ":" + this.minute;
		return time;
	}
	
	public static void main(String[] args) {
		Time time1 = new Time (22, 34, true);
		String time2 = time1.toString();
		System.out.print(time2);
    	
    }

}