package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	public Appointment (Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	public int hashCode() {
		return Objects.hash(date, time);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	public static void main(String[] args) {
		Appointment app1 = new Appointment (new Date ("May", 27, 2023, true), new Time (23, 44, true));
		System.out.println(app1.date.toString() + app1.time.toString());
	}
}
