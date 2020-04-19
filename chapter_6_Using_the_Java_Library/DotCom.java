package chapter_6_Using_the_Java_Library;
import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			locationCells.remove(index);
				
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("You sunk " + name + " !\n");
			} else {
				result = "hit";
			}
		}
		return result;
	}
}

