package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private String month;
	private int day;
	private int year;
	private boolean isHoliday;

	/**
	 * 
	 * @param integer month 1-12
	 * @param integer day between 1-31
	 * @param year
	 * @param isHoliday whether it is a holiday or not
	 */
	public Date (String month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	public String toString() {
		String date = this.month + " " + this.day + " " + this.year;
		return date;
	}
	
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}

	public static void main(String[] args) {
    	Date SamBDay = new Date ("January", 16, 2004, true);
    	Date SamBDay1 = new Date ("January", 16, 2004, true);
    	Date BarrettDay = new Date ("May", 27, 2004, true);
    	Date SuseeDay = new Date ("September", 16, 2002, true);
    	Date PradDay = new Date ("February", 4, 2004, true);
    	Date otherDay = new Date ("January", 19, 2004, true);
    	LinkedList <Date> list = new LinkedList <Date> ();
    	list.add(SamBDay);
    	list.add(BarrettDay);
    	list.add(SuseeDay);
    	list.add(PradDay);
    	list.add(otherDay);
    	list.add(SamBDay1);
    	list.add(SamBDay);
    	//System.out.println(list);
    	
     	HashSet <Date> list1 = new HashSet <Date> ();
     	list1.add(SamBDay);
    	list1.add(BarrettDay);
    	list1.add(SuseeDay);
    	list1.add(PradDay);
    	list1.add(otherDay);
    	list1.add(SamBDay);
    	System.out.println(list1);
    }
}
