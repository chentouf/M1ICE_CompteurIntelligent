package RRC.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import RRC.ModeleRRC;

public class TestsModeleRRC {

	ModeleRRC mrc;
	@Before
	public void setUp() throws Exception {
		mrc = new ModeleRRC(1, 1, 2);
	}

	@After
	public void tearDown() throws Exception {
		mrc = null;
	}

	@Test
	public void testModeleRRC() {
		assertNotNull(mrc);
		
	}

	@Test
	public void testGetDuree() {
		assertEquals(mrc.getDuree(),2);
		//test
	}

	@Test
	public void testGetPrixEnVigueurHc() {
		assertEquals(mrc.getPrixEnVigueurHc(),1);
		
	}

	@Test
	public void testGetPrixEnVigeurHp() {
		assertEquals(mrc.getPrixEnVigeurHp(),1);
	}

	@Test
	public void testInitMesure() {
		fail("Not yet implemented");
	}

	@Test
	public void testMajMesure() {
		fail("Not yet implemented");
	}

	@Test
	public void testCharger() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnregistrer() {
		fail("Not yet implemented");
	}

	@Test
	public void testProduireFacture() {
		fail("Not yet implemented");
	}

}
