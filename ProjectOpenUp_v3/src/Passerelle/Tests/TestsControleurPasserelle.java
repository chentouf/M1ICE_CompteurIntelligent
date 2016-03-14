package Passerelle.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LCD.ModeleLCD;
import Passerelle.ControleurPasserelle;
import Passerelle.ModelePasserelle;
import RRC.ModeleRRC;

public class TestsControleurPasserelle {
	
	ControleurPasserelle cp;

	@Before
	public void setUp() throws Exception {
		cp = new ControleurPasserelle(1);
		
	}

	@After
	public void tearDown() throws Exception {
		cp = null;
	}

	@Test
	public void testControleurPasserelleModeleLEDModelePasserelleModeleLEDModeleLCDModelePasserelle() {
	}

	@Test
	public void testControleurPasserelle() {
	}

	@Test
	public void testMajSysteme() {}

	@Test
	public void testGetListeModeleLED() {
	}

	@Test
	public void testAddListeModeleLED() {
	}

	@Test
	public void testRemoveListeModeleLED() {
	}

	@Test
	public void testClearListeModeleLED() {
	}

	@Test
	public void testGetSetModeleLCD() {
	}

	@Test
	public void testGetSetModelePasserelle() {
		ModelePasserelle mp = new ModelePasserelle();
		cp.setModelePasserelle(mp);
		assertEquals(cp.getModelePasserelle(),mp);
	}

	@Test
	public void testGetSetModeleRRC() {
	}

}
