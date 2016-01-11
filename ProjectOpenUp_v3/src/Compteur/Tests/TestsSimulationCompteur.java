package Compteur.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.SimulationCompteur;
import Passerelle.SimulationPasserelle;

public class TestsSimulationCompteur {
	
	SimulationCompteur sc;

	@Before
	public void setUp() throws Exception {
		sc = new SimulationCompteur("Compteur 1");
	}

	@After
	public void tearDown() throws Exception {
		sc = null;
	}
	
	@Test
	public void testSimulationCompteur() {
		
	}

	@Test
	public void testGetControleur() {
	}

	@Test
	public void testRun() {
		
		SimulationPasserelle simulation = new SimulationPasserelle();
		new Thread(simulation).start();
		int hc1 = sc.getControleur().getModeleCompteur().getHc();
		new Thread(simulation);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int hc2 = sc.getControleur().getModeleCompteur().getHc();

		assertFalse(hc1>hc2);
	}

	@Test
	public void testMain() {
		
	}

}
