package LED.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.VueLED;

public class TestsVueLED {
	VueLED vl;
	
	@Before
	public void setUp() throws Exception {
		vl = new VueLED();
	}

	@After
	public void tearDown() throws Exception {
		vl = null;
	}

	@Test
	public void testVueLED() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSetDisplay() {
		fail("Not yet implemented");
	}

}
