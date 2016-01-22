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

		mr = new ModeleRRC(1,2,30);
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
	public void testGetSetPrixEnVigueur() {}

	@Test
	public void testGetSetTabMesuresTraitees() {}

	@Test
	public void testGetSetItsControleurPasserelle() {}

}
