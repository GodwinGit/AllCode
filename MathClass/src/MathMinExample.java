

import java.util.Scanner;

/*
 * This example source code demonstrates the use of  
 * min() method of Math class
 */

public class MathMinExample {

	public static void main(String[] args) {
		
		// Ask for user input
		System.out.print("Enter first value:");
		
		// use scanner to read the console input
		Scanner scan = new Scanner(System.in);
		
		// Assign the 1st input to String variable
		String value1 = scan.nextLine();
		
		// ask for the second input
		System.out.print("Enter second value:");
		
		// Assign the 2nd input to String variable
		String value2 = scan.nextLine();
		
		// close the scanner object
		scan.close();		
		
		// convert the values to int
		int a = Integer.parseInt(value1);
		int b = Integer.parseInt(value2);		
			
		// get the result of min method
		int result = Math.min(a,b);
		System.out.print("Lowest value:"+result);
	}

}
