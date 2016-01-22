package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import passerelle.ControleurPasserelle;
import passerelle.ModelePasserelle;

public class ControleurPasserelleTest {
	
	ControleurPasserelle pa;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetConsoGenerale() {
		pa = new ControleurPasserelle();
		assertNotNull(pa.getConsoGenerale());
	}

}
