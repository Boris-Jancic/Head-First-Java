package chapter_2_A_Trip_to_Objectville;

class TapeDeck {
	
	boolean canRecord = false;
	
	void playTape() {
		System.out.println("tape playing");
	}
	
	void recordTape() {
		System.out.println("tape recording");
	}
}

public class Exercise2a {

	public static void main(String[] args) {
		TapeDeck t = new TapeDeck(); // dodato jer t ne moze biti klasa ako 
									 // nije deklarisana
		
		t.canRecord = true;
		t.playTape();
		
		if(t.canRecord = true) {
			t.recordTape();
		}
		
	}

}
