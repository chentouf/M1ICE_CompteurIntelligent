package Passerelle.Tests;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.ModeleCompteur;
import Compteur.ModeleCompteurDate;
import Passerelle.ModelePasserelle;
import RRC.ControleurRRC;

public class TestsModelePasserelle {

	ModelePasserelle mp;
	@Before
	public void setUp() throws Exception {
		mp = new ModelePasserelle();
	}

	@After
	public void tearDown() throws Exception {
		mp = null;
	}

	@Test
	public void testModelePasserelleControleurRRC() {
		fail("Not yet implemented");
	}

	@Test
	public void testModelePasserelle() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnvoyerinfoRCCPush() {
		fail("Not yet implemented");
	}

	@Test
	public void testMajConsommation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSetIdPasserelle() {
		mp.setIdPasserelle(2);;
		assertEquals(mp.getIdPasserelle() , 2);

	}


	@Test
	public void testGetListeCompteurs() {

	}

	@Test
	public void testAddListeCompteurs() {
		ModeleCompteur p = new ModeleCompteur();
		mp.addListeCompteurs(p);

	}

	@Test
	public void testRemoveListeCompteurs() {

	}

	@Test
	public void testClearListeCompteurs() {
		Map<ModeleCompteur,LinkedList<ModeleCompteurDate>> liste = mp.getListeCompteurs();
		assertEquals(liste.size(),0);
	}

}
