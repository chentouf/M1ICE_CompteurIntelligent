package LCD.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LCD.ModeleLCD;

public class TestsModeleLCD {
	private ModeleLCD ml;
	
	@Before
	public void setUp() throws Exception {
		ml = new ModeleLCD();
	}

	@After
	public void tearDown() throws Exception {
		ml = null;
	}

	@Test
	public void testModeleLCD() {
		assertNotNull(ml);
		
	}

	@Test
	public void testGetSetDonneesAAfficher() {
		ml.setDonneesAAfficher("Test");
		assertEquals(ml.getDonneesAAfficher(),"Test");
	}

}
