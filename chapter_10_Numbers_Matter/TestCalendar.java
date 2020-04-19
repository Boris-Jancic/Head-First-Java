package chapter_10_Numbers_Matter;
import java.util.Calendar; // Use CALENDAR for Date manipulation

public class TestCalendar {
	public static void main(String[] args) {	// DO NOT USE  Calendar cal = new Calendar();
												// Calendar is an abstract class so we are 
		Calendar c = Calendar.getInstance();   // getting a concrete subclass (java.util.GregorianCallendar instance)
		c.set(2004,0,7,15,40);
		
		long day1 = c.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		c.setTimeInMillis(day1);
		
		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
		
		System.out.println("\n" + c.getTime());
		
		c.add(c.DATE, 35);
		System.out.println("add 35 days ==>  " + c.getTime());
		
		c.roll(c.DATE, 35);
		System.out.println("\nroll 35 days ==>  " + c.getTime());
		
		c.set(c.DATE, 1);
		System.out.println("\nset to 1 ==>  " + c.getTime());
	
	}

}
