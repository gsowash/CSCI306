package mainpackage;

public class DCContainer {
	public DCContainer(int dollars, int cents) 
	{
		super();
		this.dollars = dollars;
		this.cents = cents;
	}
	private int dollars, cents;
	public int getDollars() {return dollars;}
	public void setDollars(int dollars) {this.dollars = dollars;}
	public int getCents() {return cents;}
	public void setCents(int cents) {this.cents = cents;}
	
}
