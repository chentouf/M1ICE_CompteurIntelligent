package RRC.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import RRC.ControleurRRC;

public class TestsControleurRRC {

	ControleurRRC cr;
	@Before
	public void setUp() throws Exception {
		cr = new ControleurRRC(1,2,30);
	}

	@After
	public void tearDown() throws Exception {
		cr = null;
	}

	@Test
	public void testControleurRRCVueRRCModeleRRC() {
	}

	@Test
	public void testControleurRRC() {
	}

	@Test
	public void testGetModeleRRC() {
	}

	@Test
	public void testSetModeleRRC() {
	}

	@Test
	public void testGetVueRRC() {
	}

	@Test
	public void testSetVueRRC() {
	}

}
