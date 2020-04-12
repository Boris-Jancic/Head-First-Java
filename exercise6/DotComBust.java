package exercise6;
import exercise6.GameHelper;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.EOFException;
import java.util.ArrayList;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComs = new ArrayList<DotCom>();
	private int numOfGuesses;
	
	void setUpGame() {
		
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two  = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");

		dotComs.add(one);
		dotComs.add(two);
		dotComs.add(three);
		
		System.out.println("Sink the ships");

		for (DotCom dotComToSet : dotComs) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		
		try {
		for(DotCom dotComToTest : dotComs) {
			result = dotComToTest.checkYourself(userGuess);
			
			if (result.equals("hit")) {
				break;
				}
			
			if (result.equals("kill")) {
				dotComs.remove(dotComToTest);
				}
			}
		}catch(Exception e){
			System.out.println(" ");
		}
		
		System.out.println(result);
	}
	
	
	void startPlaying() {
		while(!dotComs.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess : ");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	
	void finishGame() {
		System.out.println("All Dot Coms are eliminated.");
		System.out.println("It took you " + numOfGuesses + " guesses");
	}
	
	
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
