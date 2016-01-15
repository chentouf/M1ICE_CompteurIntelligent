package RRC.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import RRC.ModeleRRC;

public class TestsModeleRRC {

	ModeleRRC mr;
	@Before
	public void setUp() throws Exception {

		mr = new ModeleRRC(1,2);
	}

	@After
	public void tearDown() throws Exception {
		mr = null;
	}

	@Test
	public void testModeleRRC() {}

	@Test
	public void testProduireFacture() {}

	@Test
	public void testGetPrixEnVigueur() {}

	@Test
	public void testSetPrixEnVigueur() {}

	@Test
	public void testGetTabMesuresTraitees() {}

	@Test
	public void testSetTabMesuresTraitees() {}

	@Test
	public void testGetItsControleurPasserelle() {}

	@Test
	public void testSetItsControleurPasserelle() {}

}
