package LCD.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LCD.ControleurLCD;
import LCD.ModeleLCD;
import LCD.VueLCD;

public class TestsControleurLCD {
	private ControleurLCD cl;

	@Before
	public void setUp() throws Exception {
		cl = new ControleurLCD();
	}

	@After
	public void tearDown() throws Exception {
		cl = null;
	}

	@Test
	public void testControleurLCDModeleLCDVueLCD() {
		cl = new ControleurLCD();
		assertNotNull(cl.getVueLCD());
		assertNotNull(cl.getModeleLCD());
	}

	@Test
	public void testControleurLCD() {
		
	}

	@Test
	public void testMajLCD() {
		
	}

	@Test
	public void testGetSetModeleLCD() {
		ModeleLCD ml = new ModeleLCD();
		cl.setModeleLCD(ml);
		assertEquals(cl.getModeleLCD(),ml);
	}	

	@Test
	public void testGetSetVueLCD() {
		VueLCD vl = new VueLCD();
		cl.setVueLCD(vl);
		assertEquals(cl.getVueLCD(), vl);		
	}

}
