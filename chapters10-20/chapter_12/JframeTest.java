package chapter_12;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JframeTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}
