package mainpackage;

//@SuppressWarnings("serial")
public class NegativeBalanceException extends RuntimeException {
	private int amntExceeded;
	
	public NegativeBalanceException() {}
	public NegativeBalanceException(int amntIn) 
	{
		amntExceeded = amntIn;
	}
	
	public String toString() 
	{
		return "The amount you are attempting to withdraw is greater than the amount contained in the envelope by " + amntExceeded + " cents. Negative balances are not allowed, please enter another amount.";
	}
}
