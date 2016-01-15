package LED.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.ControleurLED;

public class TestsControleurLED {
	ControleurLED cl;

	@Before
	public void setUp() throws Exception {
		cl = new ControleurLED();
	}

	@After
	public void tearDown() throws Exception {
		cl = null;
	}

	@Test
	public void testControleurLED() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSetModeleLED() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSetVueLED() {
		fail("Not yet implemented");
	}

}
