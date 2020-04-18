package exercise10;
import java.util.Date;	// use DATE for timestamps of now(current time)

public class TestDates {
	public static void main(String[] args) {
		
		String date1 = String.format("%tc", new Date());
		System.out.println(date1);
		
		date1 = String.format("\n%tr    Just the time", new Date());
		System.out.println(date1);
		
		Date today = new Date();
		date1 = String.format("\n%tA, %tB %td”,", today, today, today); // tA = day,	tB = month
		System.out.println(date1);										// td = month and day
		
		date1 = String.format("\n%tA, %<tB %<td”", today);				// < takes the previus printed
		System.out.println(date1);										// argument
	}
}