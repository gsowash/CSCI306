package utilities;

public class MyConverter {
	public static int FEET_PER_YARD = 3;
	public static double INCHES_TO_METERS = 0.0254;
	
	public static int yardsToFeet(int yards) {
		//return 0;
		return yards * FEET_PER_YARD;
	}
 	
	public static double englishToMeters(int feet, int inches) {
		//return 0;
		int totalInches = feet * 12 + inches;
		return totalInches * INCHES_TO_METERS;
	}

}
