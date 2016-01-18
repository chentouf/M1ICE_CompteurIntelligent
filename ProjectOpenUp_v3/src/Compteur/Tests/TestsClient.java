package Compteur.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Compteur.Client;

public class TestsClient {
	
	private Client c ;

	@Before
	public void setUp() throws Exception {
		c = new Client(1356,5);
	}

	@After
	public void tearDown() throws Exception {
		c = null ;
	}

	@Test
	public void testClient() {
		Client cf = new Client(1111, "Manchado", "Romain", "18 rue du Thor" , 31300 , "Toulouse", 4);
		assertEquals(cf.getNumClient(), 1111);
		assertEquals(cf.getNom(),"Manchado" );
		assertEquals(cf.getPrenom(),"Romain" );
		assertEquals(cf.getAdresse(),"18 rue du Thor" );
		assertEquals(cf.getCodePostal(),31300 );
		assertEquals(cf.getVille(),"Toulouse" );
		assertEquals(cf.getIntervalleReleve(), 4);
	}

	@Test
	public void testClientDefault() {
		assertEquals(c.getNumClient(), 1356);
		assertEquals(c.getNom(),"Dupont" );
		assertEquals(c.getPrenom(),"Martin" );
		assertEquals(c.getAdresse(), "36 Place du Capitole" );
		assertEquals(c.getCodePostal(),31000 );
		assertEquals(c.getVille(),"Toulouse" );
		assertEquals(c.getIntervalleReleve(), 5);
	}

	@Test
	public void testGetSetNumClient() {
		c.setNumClient(2222);
		assertEquals(c.getNumClient(), 2222);
	}

	@Test
	public void testGetSetNom() {
		c.setNom("Chentouf");
		assertEquals(c.getNom(), "Chentouf");
	}


	@Test
	public void testGetSetPrenom() {
		c.setPrenom("Anass");
		assertEquals(c.getPrenom(), "Anass");
	}


	@Test
	public void testGetSetAdresse() {
		c.setAdresse("37 avenue de rangeuil");
		assertEquals(c.getAdresse(), "37 avenue de rangeuil");
	}


	@Test
	public void testGetSetCodePostal() {
		c.setCodePostal(31400);
		assertEquals(c.getCodePostal(), 31400);
	}

	@Test
	public void testGetSetVille() {
		c.setVille("Ramonville");
		assertEquals(c.getVille(), "Ramonville");
	}


	@Test
	public void testGetSetIntervalleReleve() {
		c.setIntervalleReleve(20);
		assertEquals(c.getIntervalleReleve(), 20);
	}


}
