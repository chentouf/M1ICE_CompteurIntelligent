package LED.Tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.VueLED;

public class TestsVueLED {
	VueLED vl;
	
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
		assertNotNull(vl);
	}

	@Test
	public void testGetSetDisplay() {
		Color couleur = Color.green;
		vl.setDisplay(couleur);
		assertEquals(vl.getDisplay(), Color.green);
	}

}
