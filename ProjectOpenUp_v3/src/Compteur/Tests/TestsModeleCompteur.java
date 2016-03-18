package Compteur.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.ModeleCompteur;

public class TestsModeleCompteur {

	private ModeleCompteur mc;
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
		assertNotNull(mc);
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
	public void testGetSetId()
	{
		mc.setId(50);
		assertEquals(mc.getId(), 50);
	}
	
	@Test
	public void testConnection() {
		mc.setConnection(false);
		assertFalse(mc.isConnected());
		mc.setConnection(true);
		assertTrue(mc.isConnected());
	}


}
