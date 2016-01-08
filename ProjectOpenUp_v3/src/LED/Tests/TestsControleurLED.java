package LED.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.ControleurLED;
import LED.ModeleLED;
import LED.VueLED;

public class TestsControleurLED {
	private ControleurLED cl ;

	@Before
	public void setUp() throws Exception {
		cl = new ControleurLED();
	}

	@After
	public void tearDown() throws Exception {
		cl = null;
	}

	@Test
	public void testControleurLEDModeleLEDVueLED() {
		/*ModeleLED ml = new ModeleLED();
		VueLED vl = new VueLED();		
		cl = new ControleurLED(ml, vl);		
		assertEquals(cl.getModeleLED(),ml);
		assertEquals(cl.getVueLED(),vl);	*/
	}

	@Test
	public void testControleurLED() {

	}

	@Test
	public void testMajLED() {

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
