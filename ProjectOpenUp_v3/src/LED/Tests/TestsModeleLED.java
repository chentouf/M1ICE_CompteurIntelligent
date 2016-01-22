package LED.Tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.ModeleLED;

public class TestsModeleLED {
	ModeleLED ml;

	@Before
	public void setUp() throws Exception {
		ml = new ModeleLED();
	}

	@After
	public void tearDown() throws Exception {
		ml =null;
	}

	@Test
	public void testModeleLED() {		
		assertNotNull(ml);
	}

	@Test
	public void testGetSetEtatAAfficher() {
		ml.setEtatAAfficher(Color.green);
		assertEquals(ml.getEtatAAfficher(), Color.green);		
	}

}
