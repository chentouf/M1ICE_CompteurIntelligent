package LCD.Tests;

import static org.junit.Assert.*;

import java.util.Observable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LCD.ModeleLCD;
import LCD.VueLCD;

public class TestsVueLCD {
	
	private VueLCD vl ;

	@Before
	public void setUp() throws Exception {
		vl = new VueLCD();
	}

	@After
	public void tearDown() throws Exception {
		vl = null ;
	}

	@Test
	public void testVueLCD() {
		assertNotNull(vl);
	}

	@Test
	public void testGetSetDisplay() {
		vl.setDisplay("test");
		assertEquals(vl.getDisplay(), "test");
	}

	@Test
	public void testUpdate() {
		ModeleLCD m = new ModeleLCD();
		m.setDonneesAAfficher("test");
		vl.update(m, null);
		System.out.println("vl.getDisplay() '"+  vl.getDisplay());
		System.out.println("m.getDonneesAAfficher() "+  m.getDonneesAAfficher());
		assertEquals(vl.getDisplay(), "test" );
		assertEquals( m.getDonneesAAfficher(), "test");
	}

}
