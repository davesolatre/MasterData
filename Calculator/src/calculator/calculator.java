package calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		
		//edited by dave

		int userChoice;
		String userEntry;
		float x, y;
		Scanner scan = new Scanner(System.in);

		do {
			userChoice = displayOperations(scan);

			System.out.print("Enter First Number: ");
			userEntry = scan.nextLine();

			while (checkInput(userEntry)) {
				System.out.println("Enter First Number (No Letter): ");
				userEntry = scan.nextLine();
			}
			x = Float.parseFloat(userEntry);

			System.out.print("Enter Second Number: ");
			userEntry = scan.nextLine();

			while (checkInput(userEntry)) {
				System.out.println("Enter First Number (No Letter): ");
				userEntry = scan.nextLine();
			}
			y = Float.parseFloat(userEntry);

			switch (userChoice) {
			case 1:
				System.out.println("The Answer is: " + add(x, y));
				break;
			case 2:
				System.out.println("The Answer is: " + subtract(x, y));
				break;
			case 3:
				System.out.println("The Answer is: " + multiply(x, y));
				break;
			case 4:
				System.out.println("The Answer is: " + divide(x, y));
				break;
			case 5:
				System.out.println("Thank you!");
				break;
			default:
				System.out.println("Wrong Input: Enter 1-5 number only");
				break;
			}
		} while (userChoice != 5);
	}

	public static int displayOperations(Scanner scan) {
		int userChoice;
		String userEntry;

		System.out.println("============================");
		System.out.println("Enter Operation you want   |");
		System.out.println("1  Addition                |");
		System.out.println("2  Subtraction             |");
		System.out.println("3  Multiplication          |");
		System.out.println("4  Division                |");
		System.out.println("5  Quit                    |");
		System.out.println("============================\n");

		System.out.print("Enter Operations: ");
		userEntry = scan.nextLine();

		while (checkInput(userEntry)) {
			System.out.println("Enter First Number (No Letter): ");
			userEntry = scan.nextLine();
		}
		userChoice = Integer.parseInt(userEntry);

		return userChoice;
	}

	public static double add(float x, float y) {
		float n;
		n = x + y;
		return n;
	}
	
	public static double subtract(float x, float y) {
		float n;
		n = x - y;
		return n;
	}

	public static double multiply(float x, float y) {
		float n;
		n = x * y;
		return n;
	}

	public static double divide(float x, float y) {
		float n;
		n = x / y;
		return n;
	}

	public static boolean checkInput(String userEntry) {
		boolean hasString = false;
		for (int i = 0; i < userEntry.length(); i++) {
			if (!(userEntry.charAt(i) >= '0' && userEntry.charAt(i) <= '9')) {
				hasString = true;
			}
		}
		return hasString;

	}

}
