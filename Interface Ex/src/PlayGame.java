
/*
 * Main program for GuessableInterface Exercise
 * Author: Cyndi Rader
 */

import java.util.Scanner;

public class PlayGame 
{
	public static void main(String[] args) 
	{
		// Get the user's game choice, note that you could easily add more options
		int choice = 0;
		do {
			System.out.println("Enter 1 for Trivial Pursuit or 2 for HotCold: ");
			Scanner scan = new Scanner(System.in);
			// You would use scan.nextLine() to get a string
			choice = scan.nextInt();
		} while (choice != 1 && choice != 2);
		// Must set game to null, to avoid uninitialized variable error
		// Note that you can declare a variable of type Guessable. 
		Guessable game = null;
		// PUT YOUR CODE HERE TO CREATE A NEW GUESSABLE()
		
		
		// Note that you can instantiate game with any class that implements
		// Guessable. 
		if (choice == 1)
			game = new TrivialPursuit();
		else 
			game = new HotColdGame();
		// The following lines of code are valid because the interface ensures
		// the methods will exist.
		boolean won = false;
		while (!won)
		{
			game.getGuess();
			game.displayFeedback();
			won = game.checkGuess();				
		}
	}
}
