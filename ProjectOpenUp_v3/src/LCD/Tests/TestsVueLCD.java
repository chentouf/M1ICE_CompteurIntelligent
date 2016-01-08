package LCD.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LCD.VueLCD;

public class TestsVueLCD {
	private VueLCD vl;

	@Before
	public void setUp() throws Exception {
		vl = new VueLCD();
	}

	@After
	public void tearDown() throws Exception {
		vl = null;
	}

	@Test
	public void testVueLCD() {
		
	}

	@Test
	public void testMajVue() {

	}

	@Test
	public void testGetSetDisplay() {
		vl.setDisplay("test");
		assertEquals(vl.getDisplay(), "Test");
	}

}
