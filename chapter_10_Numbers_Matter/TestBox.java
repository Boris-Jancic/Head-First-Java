package chapter_10_Numbers_Matter;

public class TestBox {

	Integer i;
	int j;
	
	public void go() {
		j = i;
		System.out.println(j);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		TestBox t = new TestBox();
//		t.go;  <== Error here
	}
}
