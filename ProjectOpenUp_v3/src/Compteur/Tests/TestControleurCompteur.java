package Compteur.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.ControleurCompteur;
import Compteur.ModeleCompteur;
import Compteur.VueCompteur;

public class TestControleurCompteur {

	
	private ControleurCompteur cc;
	@Before
	public void setUp() throws Exception {
		this.cc = new ControleurCompteur("45");
	}

	@After
	public void tearDown() throws Exception {
		this.cc = null;
	}

	@Test
	public void testControleurCompteurString() {
		assertEquals(cc.getModeleCompteur().getId() , "45");
	}

	@Test
	public void testControleurCompteur() {
		assertNotNull(cc);
	}

	@Test
	public void testGetSetModeleCompteur() {
		ModeleCompteur mc = new ModeleCompteur();
		cc.setModeleCompteur(mc);
		assertEquals(cc.getModeleCompteur(), mc);
	}


	@Test
	public void testGetSetVueCompteur() {
		VueCompteur vc = new VueCompteur();
		cc.setVueCompteur(vc);
		assertEquals(cc.getVueCompteur(), vc);
	}
	

}
