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
	public void testGetModeleLCD() {
		ModeleLCD ml = new ModeleLCD();
		cp.setModeleLCD(ml);
		assertEquals(cp.getModeleLCD(),ml);
	}

	@Test
	public void testSetModeleLCD() {
		ModeleLCD ml = new ModeleLCD();
		cp.setModeleLCD(ml);
		assertEquals(cp.getModeleLCD(),ml);
		
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

	@Test
	public void testGetModeleRRC() {
		ModeleRRC mr = new ModeleRRC();
		cp.setModeleRRC(mr);
		assertEquals(cp.getModeleRRC(),mr);
	}

	@Test
	public void testSetModeleRRC() {
		ModeleRRC mr = new ModeleRRC();
		cp.setModeleRRC(mr);
		assertEquals(cp.getModeleRRC(),mr);
	}

}
