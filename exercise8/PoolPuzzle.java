package exercise8;

interface Nose {
	public int iMethod();
}

abstract class Picasso implements Nose {
	public int iMethod() {
		return 7;
	}
}

class Clowns extends Picasso { }

class Acts extends Picasso{
	public int iMethod() {
		return 5;
	}
}

public class PoolPuzzle extends Clowns { // PoolPuzzle is Of76
	public static void main(String[] args) {
		Nose []i = new Nose[3];
		
		i[0] = new Acts();
		i[1] = new Clowns();
		i[2] = new PoolPuzzle(); // Of76 is PoolPuzzle
		
		for (int x = 0; x < 3; x++) {
			System.out.println(i[x].iMethod() + " " + i[x].getClass());
		}
	}
}



