package scan;

import java.util.Scanner;

public class ChangeJarBasic {

	public static void main(String[] args) {
		// Create Scanner
		Scanner scanner = new Scanner(System.in);

		// Number of pennies
		System.out.println("Enter the number of pennies: ");
		int numberOfPennies = scanner.nextInt();

		// Number of nickels
		System.out.println("Enter the number of nickels: ");
		int numberOfNickels = scanner.nextInt();

		// Number of dimes
		System.out.println("Enter the number of dimes: ");
		int numberOfDimes = scanner.nextInt();

		// Number of quarters
		System.out.println("Enter the number of quarters: ");
		int numberOfQuarters = scanner.nextInt();
		
		//Close Scanner
		scanner.close();
		
		
		//Calculate the total
		int totalCents= numberOfPennies + (numberOfNickels * 5) + (numberOfDimes * 10) + (numberOfQuarters * 25);
		
		double dollarValue = totalCents / 100.0;
		
		System.out.println("Total cents: " + totalCents);
		System.out.println("Total Dollar value in jar: $" + dollarValue);
		

	}

}
