package chapter_4;

public class BeeTheCompiler1 {	// everything works as it stands
	
	class XCopy {
			
		public void main(String[] args) {
			
			int orig = 42;
			XCopy x = new XCopy();
			
			int y = x.go(orig);
			
			System.out.println(orig + " " + y);		
		}
	
		int go (int arg) {
			arg *= 2;
			return arg;
		}
	}
}