package Passerelle.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Passerelle.ModelePasserelle;

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
	public void testModelePasserelleControleurRRC() {}

	@Test
	public void testModelePasserelle() {}

	@Test
	public void testEnvoyerinfoRCCPush() {}

	@Test
	public void testMajConsommation() {}

	@Test
	public void testGetAdresseRCC() {}

	@Test
	public void testSetAdresseRCC() {}

	@Test
	public void testGetEtat() {}

	@Test
	public void testSetEtat() {}

	@Test
	public void testGetIdPasserelle() {}

	@Test
	public void testSetIdPasserelle() {}

	@Test
	public void testGetControleurRRC() {}

	@Test
	public void testSetControleurRRC() {}

	@Test
	public void testGetListeCompteurs() {}

	@Test
	public void testAddListeCompteurs() {}

	@Test
	public void testRemoveListeCompteurs() {}

	@Test
	public void testClearListeCompteurs() {}

}
