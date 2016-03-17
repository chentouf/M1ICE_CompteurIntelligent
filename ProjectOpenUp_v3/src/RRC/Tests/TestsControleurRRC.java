package RRC.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import RRC.ControleurRRC;
import RRC.ModeleRRC;
import RRC.VueRRC;

public class TestsControleurRRC {

	ControleurRRC cr;
	@Before
	public void setUp() throws Exception {
		cr = new ControleurRRC(1,1,2);
	}

	@After
	public void tearDown() throws Exception {
		cr = null;
	}

	@Test
	public void testControleurRRC() {
		assertNotNull(cr);
	}

	@Test
	public void testSetGetModeleRRC() {
		ModeleRRC p = new ModeleRRC(1, 1, 2);
		cr.setModeleRRC(p);
		assertEquals(p,cr.getModeleRRC());
		
	}

	@Test
	public void testSetGetVueRRC() {
		VueRRC a = new VueRRC();
		cr.setVueRRC(a);
		assertEquals(a,cr.getVueRRC());
		
	}
}
