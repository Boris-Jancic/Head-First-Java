package chapter_4;

public class BeeTheCompiler2 {
	
	class Clock {
		String time;
		
		void setTime(String t) {
			time = t;
		}
		
		public String getTime() {
			return time; // Error is here because the function was declared void
		}				 // and it returns something which can't happen
	}
	
	class ClockTestDrive{
		public void main(String[] args) {
			Clock c = new Clock();
			
			c.setTime("1245");
			String tod = c.getTime();
			System.out.println("time: " + tod);
		}
	}
}