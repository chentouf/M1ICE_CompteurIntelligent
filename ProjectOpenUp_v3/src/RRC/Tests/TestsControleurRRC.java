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

	ControleurRRC cr;
	@Before
	public void setUp() throws Exception {

		cr = new ControleurRRC(1,2,30);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testControleurRRCVueRRCModeleRRC() {
	}

	@Test
	public void testControleurRRC() {
	}

	@Test
	public void testGetSetModeleRRC() {
		/*ModeleRRC mr = new ModeleRRC();
		cr.setModeleRRC(mr);
		assertEquals(cr.getModeleRRC(),mr);*/
	}

	@Test
	public void testGetSetVueRRC() {
		
		VueRRC vr = new VueRRC();
		cr.setVueRRC(vr);
		assertEquals(cr.getVueRRC(), vr);
	}
}
