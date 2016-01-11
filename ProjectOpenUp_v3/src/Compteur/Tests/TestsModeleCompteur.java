package Compteur.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.ModeleCompteur;
import Passerelle.ModelePasserelle;

public class TestsModeleCompteur {

	ModeleCompteur mc;
	@Before
	public void setUp() throws Exception {
		mc = new ModeleCompteur();
	}

	@After
	public void tearDown() throws Exception {
		mc = null;
	}
	
	@Test
	public void testModeleCompteur() {
	}

	@Test
	public void testSimulerConso() {
		int initialHp = mc.getHc() ;
		int initialHc = mc.getHc() ;
		assertTrue(mc.getHp() > initialHp && mc.getHc() > initialHc );
	}

	@Test
	public void testGetSetHc() {
		mc.setHc(50);
		assertEquals(mc.getHc() , 50);
	}

	@Test
	public void testGetSetHp() {
		mc.setHp(50);
		assertEquals(mc.getHp() , 50);
	}

	@Test
	public void testGetSetModelePasserelle() {
		ModelePasserelle mp = new ModelePasserelle();
		mc.setModelePasserelle(mp);
		assertEquals(mc.getModelePasserelle(), mp);
	}

}