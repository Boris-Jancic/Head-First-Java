package chapter_3;

class Books {
	String title;
	String author;
}

public class Exercise1a {
	public static void main(String [] args) {
		
		Books [] myBooks = new Books[3];
		int x = 0;
		
		myBooks[0].title = "The Grapes of Java";
		myBooks[0].author = "bob";
		myBooks[1].title = "The Java Gatsby";
		myBooks[1].author = "sue";
		myBooks[2].title = "The Java Cookbook";
		myBooks[2].author = "ian";
		
		
		int i = 0; // i mora biti deklarisano pre nego sto se iskoristi
		while (i < 3) {
			System.out.print(myBooks[i].title);
			System.out.print(" by ");
			System.out.println(myBooks[i].author);
			i = i + 1;
		}
	}
}
