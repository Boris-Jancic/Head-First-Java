package chapter_4;

public class PoolPuzzle {	// Commented lines are the answers
	public static void main(String[] args) {
		Puzzle4b[] obs = new Puzzle4b[6]; // Puzzle4b[] obs = new Puzzle4b[6]
		int y = 1;
		int x = 0;
		int result = 0;
		
		while(x < 6) {
			obs[x] = new Puzzle4b();// obs[x] = new Puzzle4b()
			obs[x].ivar = y;
			y *= 10;
			x += 1;
		}
		x = 6;
		
		while(x > 0) {
			x -= 1;
			result = result + obs[x].doStuff(x); // after +,obs[x].doStuff(x) 
		}
		System.out.println("result "+ result);
	}
}

class Puzzle4b /* Puzzle4b */ {
	int ivar;
	public /*public*/ int /*int*/ doStuff(int factor/*factor*/){
		if (ivar > 100) {
			return ivar * factor;// ivar * factor
		}else {
			return ivar * (5 - factor);// ivar * (5 - factor)
		}
			
	}
}