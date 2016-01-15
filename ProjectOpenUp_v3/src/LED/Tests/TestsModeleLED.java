package LED.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.ModeleLED;

public class TestsModeleLED {
	ModeleLED ml;

	@Before
	public void setUp() throws Exception {
		ml = new ModeleLED();
	}

	@After
	public void tearDown() throws Exception {
		ml =null;
	}

	@Test
	public void testModeleLED() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSetEtatAAfficher() {
		fail("Not yet implemented");
	}

}
