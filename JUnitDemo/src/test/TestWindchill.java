package test;

import static org.junit.Assert.*;

import org.junit.Test;

import windchill.BadInputException;
import windchill.MyTempConverter;

public class TestWindchill {

	@Test (expected = BadInputException.class)
	public void test() {
		try { 
		long actual = MyTempConverter.windChill(4, 10);
		} catch (BadInputException e) {
			System.out.println("Sorry, wind chill doesn't make sense if speed is < 5");
		}
	}

}
