package chapter_10;

public class TestFormats {
	
	public static void main(String[] args) {
	
		int i = 1000000000;
		String s = String.format("%, d", i);
		System.out.println(i + "   without formating");
		System.out.println(s + "   with formating");

		String s1 = String.format("\nI have %.2f bugs to fix.", 476578.09876);
		String s2 = String.format("I have %,.2f bugs to fix.", 476578.09876);

		System.out.println(s1);
		System.out.println(s2);
		
		int one = 20456654;
		double two = 100567890.248907;
		String g = String.format("The rank is %,d out of %,.2f", one, two);
		System.out.println("\n" + g);
	}
}
