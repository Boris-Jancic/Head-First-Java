package chapter_11_Risky_Behavior;
import javax.sound.midi.*;

public class MusicTest {
	
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("We got a sequencer");
		} catch(MidiUnavailableException ex) {
			System.out.println("Bummer");
		}
	}
	
	public static void main(String[] args) {
		MusicTest mt = new MusicTest();
		mt.play();
	}

}
