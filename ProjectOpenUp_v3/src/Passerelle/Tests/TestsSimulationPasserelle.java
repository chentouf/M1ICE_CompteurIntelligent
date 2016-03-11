package Passerelle.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Passerelle.SimulationPasserelle;

public class TestsSimulationPasserelle {
	SimulationPasserelle sp;

	@Before
	public void setUp() throws Exception {
		sp = new SimulationPasserelle();
	}

	@After
	public void tearDown() throws Exception {
		sp = null;
	}

	@Test
	public void testSimulationPasserelle() {
		assertNotNull(sp);
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testRun() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetControleurPasserelle() {
		fail("Not yet implemented");
	}

}
