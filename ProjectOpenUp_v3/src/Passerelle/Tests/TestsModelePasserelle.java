package Passerelle.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Passerelle.ModelePasserelle;
import RRC.ModeleRRC;

public class TestsModelePasserelle {
	ModelePasserelle mp;

	@Before
	public void setUp() throws Exception {
		mp = new ModelePasserelle();
	}

	@After
	public void tearDown() throws Exception {
		mp = null;
	}

	@Test
	public void testModelePasserelleControleurRRC() {
		assertNotNull(mp);
	}

	@Test
	public void testModelePasserelle() {
		assertNotNull(mp);
	}

	@Test
	public void testMajSysteme() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnvoyerinfoRCCPush() {
		fail("Not yet implemented");
	}

	@Test
	public void testMajConsommation() {
	}

	@Test
	public void testGetSetModeleRRC() {
		ModeleRRC mr = new ModeleRRC(1,1,2);
		mp.setModeleRRC(mr);
		assertEquals(mp.getModeleRRC(),mr);
	}

	@Test
	public void testGetSetIdPasserelle() {
		mp.setIdPasserelle(3);
		assertEquals(mp.getIdPasserelle(),3);
	}
	@Test
	public void testGetListeCompteurs() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddListeCompteurs() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveListeCompteurs() {
		fail("Not yet implemented");
	}

	@Test
	public void testClearListeCompteurs() {
		fail("Not yet implemented");
	}

}
