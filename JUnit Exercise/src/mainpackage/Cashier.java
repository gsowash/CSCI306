package mainpackage;


public class Cashier {
	
	public Cashier() {}
	
	public DCContainer subtractDC(DCContainer envelopeAmnt, DCContainer costAmnt) throws NegativeBalanceException 
	{
		double envDouble, costDouble;
		int dollar, cent;
		envDouble= envelopeAmnt.getDollars()+envelopeAmnt.getCents()*.01;
		costDouble= costAmnt.getDollars()+costAmnt.getCents()*.01;
		if ((envDouble-costDouble)<0)
			throw new NegativeBalanceException((int)((costDouble-envDouble)*100));
		envDouble=envDouble-costDouble;
		dollar=(int) (envDouble);
		cent=(int)((envDouble*100)%100);
		return new DCContainer(dollar,cent);		
	}

	public DCContainer fromEnvelope(Envelope source) 
	{
		double envDouble=0;
		int dollar,cent;
		envDouble=source.dollars+source.quarters*.25+source.dimes*.1+source.nickels*.05+source.pennies*.01;
		dollar=(int) (envDouble);
		cent=(int)((envDouble*100)%100);
		return new DCContainer(dollar,cent);
	}

	public Envelope toEnvelope(DCContainer source) 
	{
		int envAmt=0;
		int dollar, quarter, dime, nickel, penny;
		envAmt=source.getDollars()*100+source.getCents();
		dollar= envAmt/100;
		envAmt=envAmt%100;
		quarter= envAmt/25;
		envAmt=envAmt%25;
		dime= envAmt/10;
		envAmt=envAmt%10;
		nickel= envAmt/5;
		envAmt=envAmt%5;
		penny= envAmt;
		return new Envelope(dollar,quarter, dime, nickel, penny);
	}

}