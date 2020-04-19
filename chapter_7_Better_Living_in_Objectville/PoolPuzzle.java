package chapter_7_Better_Living_in_Objectville;

public class PoolPuzzle {
	public static void main(String [] args) {
		
		Boat b1 = new Boat();
		SailBoat b2 = new SailBoat();
		RowBoat b3 = new RowBoat();
		
		b2.setLenght(32);
		b1.move();
		b3.move();
		b2.move();
	}
}

class Boat {
	private int lenght;
	
	public void setLenght(int len) {
		lenght = len;
	}
	
	public int getLenght() {
		return lenght;
	}
	
	public void move() {
		System.out.print("drift ");
	}
}


class RowBoat extends Boat {
	public void rowTheBoat() {
		System.out.print("stroke natasha");
	}
}


class SailBoat extends Boat {
	public void move() {
		System.out.print("hoist sail ");
	}
}