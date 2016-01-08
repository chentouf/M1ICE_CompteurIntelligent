package Compteur.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.VueCompteur;

public class TestsVueCompteur {
	private VueCompteur vc;

	@Before
	public void setUp() throws Exception {
		vc = new VueCompteur();
	}

	@After
	public void tearDown() throws Exception {
		vc = null;
	}

	@Test
	public void testVueCompteur() {
		
	}

	@Test
	public void testMajVue() {
	}

	@Test
	public void testGetSetDisplay() {
		vc.setDisplay("Test display");
		assertEquals(vc.getDisplay(), "Test display");
	}

}
