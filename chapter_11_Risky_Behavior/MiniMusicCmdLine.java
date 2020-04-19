package chapter_11_Risky_Behavior;
import javax.sound.midi.*;

public class MiniMusicCmdLine { 
	public static void main(String[] args) {
		
			MiniMusicCmdLine mini = new MiniMusicCmdLine();
			System.out.println("Durmmm");
			
			
//			int instrument2 = Integer.parseInt("42");			OTHER INSTRUMENTS
//			int note2 = Integer.parseInt("55");
//			mini.play(instrument2, note2);
//			
//			
//			int instrument1 = Integer.parseInt("102");
//			int note1 = Integer.parseInt("30");
//			mini.play(instrument1, note1);
//		
//			int instrument3 = Integer.parseInt("123");
//			int note3 = Integer.parseInt("30");
//			mini.play(instrument3, note3);
			
			int instrument4 = Integer.parseInt("15");
			int note4 = Integer.parseInt("120");
			mini.play(instrument4, note4);
	}

	void play(int instrument, int note) {
		try {
			
			Sequencer player = MidiSystem.getSequencer();
			player.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			//MidiEvent event = null;

			ShortMessage first = new ShortMessage();
			first.setMessage(192, 1, instrument, 0);
			MidiEvent changeInstrument = new MidiEvent(first, 1);
			track.add(changeInstrument);

			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, note, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);

			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, note, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			player.setSequence(seq);
			player.start();

			Thread.sleep(2000);
			player.close();
			System.exit(0);
		
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
} 