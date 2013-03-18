package windchill;

public class MyTempConverter {
	public static long windChill(int speed, int temperature) 
		throws BadInputException {
		if (speed < 5)
			throw new BadInputException("wind speed must be > 5");
		return 0;
	}
	

}
