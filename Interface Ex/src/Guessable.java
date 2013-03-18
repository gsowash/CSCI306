import java.util.Scanner;

public class Guessable {
	String answer;
	
	public void getGuess()
	{
		System.out.println("Please input your answer");
		Scanner input = new Scanner (System.in);
		answer = input.nextLine();
	}
	
	public boolean checkGuess()
	{
		if (answer==TrivialPursuit.qAndA[questionnum][1])
			return true;
		else
			return false;
	}
	
	public void displayFeedback()
	{
	
	}
}
