package rpsGame;

import java.util.Random;
import java.util.Scanner;

public class rpsGame {

	public static void main(String[] args) {
		//edited by dave

		Scanner scan = new Scanner(System.in);

		while (true) {
			String[] rps = { "r", "p", "s" };
			String computerMove = rps[new Random().nextInt(rps.length)];

			String playerMove;

			while (true) {
				System.out.println("Please Enter you move(r , p or s): ");
				playerMove = scan.nextLine();
				if (playerMove.equals("r") || playerMove.equals("s") || playerMove.equals("p")) {
					break;
				}
				System.out.println(playerMove + " is not a valid move");
			}

			System.out.println("Computer played: " + computerMove);
			if (playerMove.equals(computerMove)) {
				System.out.println("The was a tie!!");
			} else if (playerMove.equals("r")) {
				if (computerMove.equals("p")) {
					System.out.println("You Lose!!");
				} else if (computerMove.equals("s")) {
					System.out.println("you win!!!");
				}
			} else if (playerMove.equals("p")) {
				if (computerMove.equals("r")) {
					System.out.println("You Lose!!");
				} else if (computerMove.equals("s")) {
					System.out.println("you win!!!");
				}
			}

			else if (playerMove.equals("s")) {
				if (computerMove.equals("p")) {
					System.out.println("You Lose!!");
				} else if (computerMove.equals("r")) {
					System.out.println("you win!!!");
				}
			}
			System.out.println("Play Again? (y/n)");
			String playAgain = scan.nextLine();

			if (!playAgain.equals("y")) {
				System.out.println("Thank you for Playing!!");
				break;
				
			}
		}

	}
}
