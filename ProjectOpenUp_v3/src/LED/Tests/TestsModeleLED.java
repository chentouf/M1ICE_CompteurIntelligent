package LED.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LED.ModeleLED;

public class TestsModeleLED {
<<<<<<< HEAD
	private ModeleLED ml;
	 
=======
	ModeleLED ml;

>>>>>>> branch 'V3' of https://github.com/chentouf/M1ICE_CompteurIntelligent.git
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
		ml.setEtatAAfficher(1);
		assertEquals(ml.getEtatAAfficher(), 1);		
	}

}
