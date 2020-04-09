package exercise4;

public class MixedMessagesPuzzle {

	int counter = 0;
	
	public static void main(String[] args) {
		int count = 0;
		MixedMessagesPuzzle [] m4a = new MixedMessagesPuzzle[20];
		int x = 0;
		
		while(x < 19) {
			m4a[x] = new MixedMessagesPuzzle();
			m4a[x].counter += 1;
			count += 1;
			count += m4a[x].maybeNew(x);
			x += 1;
		}
		System.out.println(count + " " + m4a[1].counter);
	}
	
	public int maybeNew(int index) {
		if (index < 1) {
			MixedMessagesPuzzle m4 = new MixedMessagesPuzzle();
			m4.counter += 1;
			return 1;
		}
		return 0;
	}

}
