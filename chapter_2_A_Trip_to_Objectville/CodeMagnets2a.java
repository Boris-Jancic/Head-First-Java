package chapter_2_A_Trip_to_Objectville;

class DrumKit {
	
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare() {
		System.out.println("bang bang ba-bang");
	}
	
	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}

public class CodeMagnets2a {

	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		
		d.playTopHat();
		
		if(d.snare == true) {
			d.playSnare();
		}
		
	}

}
