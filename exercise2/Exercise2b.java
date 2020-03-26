package exercise2;

class DVDPlayer {
	
	boolean canRecord = false;
	
	void recordDVD() {
		System.out.println("DVD is recording");
	}
	
	void playDVD() {							// ovo je dodato
		System.out.println("DVD is playing");	// ovo je dodato
	}											// ovo je dodato
	
}


public class Exercise2b {

	public static void main(String[] args) {
		DVDPlayer d = new DVDPlayer();
		
		d.canRecord = true;
		d.playDVD (); // playDVD nigde nije napisana kao funkcija
		
		if (d.canRecord == true) {
			d.recordDVD();
		}
		
	}

}
