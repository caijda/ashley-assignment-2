package com.coderscampus;

import java.util.Scanner;

public class Game {
	private int turn;

	Game() {
		turn = 0;
	}

	void playerGuess(int random) {
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();

		while (turn < 6) {
			if (turn < 5) {
				if (guess < 1 || guess > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again");
					guess = scanner.nextInt();
				} else {
					if (guess < random) {
						System.out.println("Please pick a higher number");
						guess = scanner.nextInt();
						turn++;
					} else if (guess > random) {
						System.out.println("Please pick a lower number");
						guess = scanner.nextInt();
						turn++;
					} else {
						System.out.println("You win!");
						break;
					}
				}
			} else {
				System.out.println("You lose, the nubmer to guess was " + random);
				break;
			}
		}

		scanner.close();
	}
}
