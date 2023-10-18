package com.coderscampus;

import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		System.out.println("Pick a number between 1 and 100");
		
		Random random = new Random();
		int theRandomNumber = random.nextInt(100);
		theRandomNumber++;
				
		Game game = new Game();
		game.playerGuess(theRandomNumber);
	}

}
