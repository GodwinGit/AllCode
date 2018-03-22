
/*
 * A java example source code to demonstrate
 * the use of setCharAt() method of StringBuilder class
 */

public class StringBuilderSetCharAtExample {

	public static void main(String[] args) {

		// initialize the StringBuilder object
		StringBuilder sb = new StringBuilder("javatutorialhq.com");
		System.out.println("Contents of StringBuilder:" + sb);

		int index = 15;
		char ch = 'X';

		// change the character at index 15
		sb.setCharAt(index, ch);
		System.out.println("New Contents of StringBuilder:" + sb);
	}
}
