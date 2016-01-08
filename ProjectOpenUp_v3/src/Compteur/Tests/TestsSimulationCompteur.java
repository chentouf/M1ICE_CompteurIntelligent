package Compteur.Tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import Compteur.SimulationCompteur;

public class TestsSimulationCompteur {
	private SimulationCompteur sc;

	@Test
	public void testSimulationCompteur() {
		sc = new SimulationCompteur("Compteur 1");
	}

	@Test
	public void testGetControleur() {
		sc = null;
	}

	@Test
	public void testRun() {
		
	}

	@Test
	public void testMain() {
		
	}

}
