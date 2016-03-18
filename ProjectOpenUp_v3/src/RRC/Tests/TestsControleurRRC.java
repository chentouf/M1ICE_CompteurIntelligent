
package RRC.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.VueLED;
import RRC.ControleurRRC;
import RRC.ModeleRRC;
import RRC.VueRRC;

public class TestsControleurRRC {

	private ControleurRRC cr;

	@Before
	public void setUp() throws Exception {
		ControleurRRC cr = new ControleurRRC(0,0,0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testControleurRRC() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetModeleRRC() {
		ModeleRRC mr = new ModeleRRC(0, 0, 0);
		cr.setModeleRRC(mr);
		assertEquals(cr.getModeleRRC(),mr);
	}

	@Test

	public void testSetModeleRRC() {
		ModeleRRC mr = new ModeleRRC(0, 0, 0);
		cr.setModeleRRC(mr);
		assertEquals(cr.getModeleRRC(),mr);
	}

	@Test
	public void testGetVueRRC() {
		
		VueRRC vr = new VueRRC(null);
		cr.setVueRRC(vr);
		assertEquals(cr.getVueRRC(), vr);
	}

	@Test
	public void testSetVueRRC() {
		
		VueRRC vr = new VueRRC(null);
		cr.setVueRRC(vr);
		assertEquals(cr.getVueRRC(), vr);

	}

}



