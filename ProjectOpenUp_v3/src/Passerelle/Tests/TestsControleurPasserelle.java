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

	private ControleurPasserelle cp;
	@Before
	public void setUp() throws Exception {

		cp = new ControleurPasserelle(1);
		

	}

	@After
	public void tearDown() throws Exception {

		cp = null;
	}

	@Test
	public void testControleurPasserelle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSetDuree() {
		fail("Not yet implemented");
	}

	@Test

	public void testGetModelePasserelle() {
		ModelePasserelle mp = new ModelePasserelle();
		cp.setModelePasserelle(mp);
		assertEquals(cp.getModelePasserelle(),mp);
	}

	@Test
	public void testSetModelePasserelle() {
		ModelePasserelle mp = new ModelePasserelle();
		cp.setModelePasserelle(mp);
		assertEquals(cp.getModelePasserelle(),mp);
		
	}

}



