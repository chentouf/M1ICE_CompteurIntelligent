package LED.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.VueLED;

public class TestsVueLED {
	private VueLED vl;

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
	}

	@Test
	public void testMajVue() {
		
	}

	@Test
	public void testGetDisplay() {
		vl.setDisplay("Test");
		assertEquals(vl.getDisplay(), "Test");
	}

}
