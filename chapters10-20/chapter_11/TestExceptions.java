package chapter_11;
import chapter_11.ScaryException;

public class TestExceptions {
	
	public static void main(String [] args) {
		String test = "no";

		try {
			System.out.println("start try");
			doRisky(test);	// error here
			System.out.println("end try");
		} catch ( ScaryException se) {	// error here
			System.out.println("scary exception");
		} finally {
			System.out.println("finally");
		}
			System.out.println("end of main");
	}
	
	static void doRisky(String test) throws ScaryException {	// error here
		System.out.println("start risky");
		if ("yes".equals(test)) {
			throw new ScaryException();		// error here
		}
			System.out.println("end risky");
		return;
	}
}