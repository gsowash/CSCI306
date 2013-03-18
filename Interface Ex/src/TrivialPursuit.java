import java.util.Random;


public class TrivialPursuit extends Guessable {
	public static void main(String args[])
	{
		Random rand = new Random();
		int questionnum = rand.nextInt(5);
		String[][] qAndA = new String [5][2];
		qAndA[0][0] = "What sense is most closely linked to memory?";
		qAndA[0][1] = "smell";
		qAndA[1][0] = "Which of the 48 contiguous U.S. states has the fewest people? ";
		qAndA[1][1] = "Wyoming";
		qAndA[2][0] = "How many furlongs to a mile?";
		qAndA[2][1] = "8";
		qAndA[3][0] = "What's the most commonly-spoken language in Belgium?";
		qAndA[3][1] = "French";
		qAndA[4][0] = "Who programmed this?";
		qAndA[4][1] = "Geoff";
		
		System.out.println("In trivial pursuit");
		System.out.println(qAndA[questionnum][0]);
	}
}
