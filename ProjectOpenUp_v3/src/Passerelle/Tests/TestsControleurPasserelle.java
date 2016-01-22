package Passerelle.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.ModeleCompteur;
import LCD.ModeleLCD;
import LED.ModeleLED;
import Passerelle.ControleurPasserelle;
import Passerelle.ModelePasserelle;

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
	public void testControleurPasserelle() {
		assertNotNull(cp);
	}

	@Test
	public void testGetSetSetDuree() {
		cp.setDuree(2);
		assertEquals(cp.getDuree(), 2);
	}

	@Test
	public void testGetSetModeleLCD() {
		ModeleLCD ml = new ModeleLCD();
		cp.setModeleLCD(ml);
		assertEquals(cp.getModeleLCD(), ml);
	}

	@Test
	public void testGetSetModelePasserelle() {
		ModelePasserelle mp = new ModelePasserelle();
		cp.setModelePasserelle(mp);
		assertEquals(cp.getModelePasserelle(), mp);
	}

	@Test
	public void testGetSetModeleLEDEtatConnectionCompteur() {
		ModeleLED m = new ModeleLED();
		cp.setModeleLEDEtatConnectionCompteur(m);
		assertEquals(cp.getModeleLEDEtatConnectionCompteur(), m);
	}

	@Test
	public void testGetSetModeleLEDEtatConnectionRRC() {
		ModeleLED m = new ModeleLED();
		cp.setModeleLEDEtatConnectionRRC(m);
		assertEquals(cp.getModeleLEDEtatConnectionRRC(), m);
	}

}
