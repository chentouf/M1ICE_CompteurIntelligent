package Compteur.Tests;

import static org.junit.Assert.*;

import java.util.Observable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.ModeleCompteur;
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
		assertNotNull(vc);
	}


	@Test
	public void testGetSetDisplay() {
		vc.setDisplay("Test display");
		assertEquals(vc.getDisplay(), "Test display");
	}
	
	@Test
	public void testUpdate() {
		ModeleCompteur modele = new ModeleCompteur();
		vc.update(modele,null);
		assertEquals(vc.getDisplay(),modele.getId()+" : "+modele.getHc()+" / "+modele.getHp() );
	}

}
