package chapter_5;

public class BeeTheJvm1 {
	
	class Output{
		
		void go() {
			int y = 7;
			
			for(int x = 1; x < 8 ; x++) {
				y++; // y x y x  y x  y  X  y  X  y X  y 
					//  8 2 9 3 10 4 11  5 12  6 13 7 14
				if (x > 4) {
					System.out.println(++y + " ");
				}
				if (y > 14) {
					System.out.println(" x + " + x);
					break;
				}
			}
		}
	
	
	public void main(String [] args) {
		Output o = new Output();
		o.go();
		}
	}
}