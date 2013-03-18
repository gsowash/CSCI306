package test;

import static org.junit.Assert.*;
import game.Location;

import org.junit.Before;
import org.junit.Test;

public class TestLocation {
	private Location location = new Location();
	
	@Before
	public void setUp() {
		//location = new Location();
		System.out.println("Setting up");
	}

	@Test
	public void testMove() {
		location.move(5, 10);
		assertEquals(5, location.getX());
		assertEquals(10, location.getY());	
	}
	
	@Test
	public void testMove2() {
		Location location = new Location(20, 30);
		location.move(5, 10);
		assertEquals(5, location.getX());
		assertEquals(10, location.getY());	
		location.move(5, 10);
		assertEquals(10, location.getX());
		assertEquals(20, location.getY());	
	}

}
