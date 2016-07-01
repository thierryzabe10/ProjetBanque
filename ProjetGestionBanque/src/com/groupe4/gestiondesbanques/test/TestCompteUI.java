package com.groupe4.gestiondesbanques.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groupe4.gestiondesbanques.entity.Compte;
import com.groupe4.gestiondesbanques.service.compte.IServiceCompte;
/**
 * 
 * @author inti0298
 *classe de Test de la classe Compte
 */
public class TestCompteUI {
	private static IServiceCompte service;
	private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("app.xml");
		service=(IServiceCompte) context.getBean("serviceCompte");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
/*
 //test validé par junit
	@Test
	public void testAddCompte() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = sdf.parse("14/09/2014");
		@SuppressWarnings("unused")
		Date date2 = sdf.parse("25/09/2012");
		Compte c1 = new CompteCourant(2500.28, date1);
		Compte c2 = new CompteCourant(880.18, date1);
		service.addCompte(c1, 1L, 1L, 1L);
		service.addCompte(c2, 1L, 1L, 1L);
	}*/
/*
 //test validé par junit
	@Test
	public void testDeleteCompte() {
		Compte c =service.getCompte(2L);
		service.deleteCompte(2L);
		assertNotNull(c.getNumero());
		
	}*/
/*
 //test validé par JUnit
	@Test
	public void testGetCompte() {
	Compte c = service.getCompte(1L);
		assertNotNull(c.getNumero());
	}*/
/*
 //validé par junit
	@Test
	public void testModifierRenseignement() {
		Compte c = service.getCompte(1L);
		c.setSolde(450.12);
		service.modifierRenseignement(c);
		Compte c1 =service.getCompte(1L);
		assertTrue(c.getSolde().equals(c1));
	}
	*/
/*
 //validé par junit
	@Test
	public void testGetComptesParClient() {
		List<Compte>listeDesComptes = service.getComptesParClient(1L);
		}
	*/

	/*@Test
	public void testGetComptesParEmploye() {
		List<Compte>tabCompteEmploye = service.getComptesParEmploye(1L);
		
	}*/


}
