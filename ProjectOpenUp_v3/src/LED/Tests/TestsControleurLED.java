package LED.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.ModeleLED;
import LED.VueLED;
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
		ModeleLED ml = new ModeleLED();
		VueLED vl = new VueLED();
		this.cl = new ControleurLED();
		cl.setModeleLED(ml);
		cl.setVueLED(vl);
		assertNotNull(cl.getModeleLED());
		assertNotNull(cl.getVueLED());
	}

	@Test
	public void testGetSetModeleLED() {
		ModeleLED ml = new ModeleLED();
		cl.setModeleLED(ml);
		assertEquals(cl.getModeleLED(),ml);
	}

	@Test
	public void testGetSetVueLED() {
		VueLED vl = new VueLED();
		cl.setVueLED(vl);
		assertEquals(cl.getVueLED(), vl);
	}

}
