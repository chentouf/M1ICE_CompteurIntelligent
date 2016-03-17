package RRC.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import RRC.VueRRC;

public class TestsVueRRC {
	VueRRC vrc;

	@Before
	public void setUp() throws Exception {
		vrc = new VueRRC();
	}

	@After
	public void tearDown() throws Exception {
		vrc = null;
	}

	@Test
	public void testVueRRC() {
		assertNotNull(vrc);
	}

	@Test
	public void testMajVue() {
		
	}

	@Test
	public void testGetSetDisplay() {
		vrc.setDisplay("test");
		assertEquals(vrc.getDisplay(),"test");
	}

}
