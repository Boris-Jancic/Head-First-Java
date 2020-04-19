package chapter_9_Life_and_Death_of_an_Object;

public class GC {
		
	public static GC doStuff() {
			GC newGC = new GC();
			doStuff2(newGC);
			return newGC;
		}
		
		public static void main(String [] args) {
			GC gc1;
			GC gc2 = new GC();
			GC gc3 = new GC();
			GC gc4 = gc3;
			gc1 = doStuff();
			// call more methods
		}
		
		public static void doStuff2(GC copyGC) {
			GC localGC = copyGC;
		}
}
/* Answers
 * 1. no
 * 3. no
 * 5. no
 * 6. no
 * 7. no
 * 8. no */
