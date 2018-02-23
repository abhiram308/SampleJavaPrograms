package examples.java;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/*
 * Compare performance of making Date and Calendar objects once using static block vs making their instances each time
 * */
public class StaticCalendarVsNonStatic {
	public static void main(String[] args) {
		
		// time taken: 5000 ms
		System.out.println(new Date().getTime());
		for (int i = 0; i < 10000000; i++) {
			Person1 person1 = new Person1(new Date());
			person1.isBoomer();
		}
		System.out.println(new Date().getTime());
		
		// time taken: 500ms
		System.out.println(new Date().getTime());
		for (int i = 0; i < 10000000; i++) {
			Person2 person2 = new Person2(new Date());
			person2.isBoomer();
		}
		System.out.println(new Date().getTime());
	}
}

class Person1 {
	private Date birthDate;
	Person1(Date date) {
		birthDate = date;
	}

	public boolean isBoomer() {
		Calendar gmt = Calendar.getInstance(TimeZone.getDefault());
		gmt.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date startDate = gmt.getTime();

		gmt.set(1964, Calendar.JANUARY, 1, 0, 0, 0);
		Date endDate = gmt.getTime();

		return birthDate.compareTo(startDate) >= 0 && birthDate.compareTo(endDate) < 0;

	}
}

class Person2 {
	private Date birthDate;
	
	Person2(Date date) {
		birthDate = date;
	}

	private static Date startDate;
	private static Date endDate;

	static {
		Calendar gmt = Calendar.getInstance(TimeZone.getDefault());
		gmt.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		startDate = gmt.getTime();

		gmt.set(1964, Calendar.JANUARY, 1, 0, 0, 0);
		endDate = gmt.getTime();
	}

	public boolean isBoomer() {
		return birthDate.compareTo(startDate) >= 0 && birthDate.compareTo(endDate) < 0;
	}
}