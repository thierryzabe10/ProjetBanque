package com.groupe4.gestiondesbanques.dao.compte;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.groupe4.gestiondesbanques.dao.singleton.Singleton;
import com.groupe4.gestiondesbanques.entity.Banque;
import com.groupe4.gestiondesbanques.entity.Client;
import com.groupe4.gestiondesbanques.entity.Compte;
import com.groupe4.gestiondesbanques.entity.Employe;

/**
 * Nom de la classe : DAOCompteImpl
 * Implémente l'interface IDaoCompte
 * package com.groupe4.gestiondesbanques.dao.compte;
 * @author grégoire RAYNAUD
 * Date : 30/06/2016
 */
public class DaoCompteImpl implements IDaoCompte{

	Logger log = Logger.getLogger("DaoCompteImpl");
	SessionFactory sf = Singleton.getSessionfactory();
	@Override
	public Compte addCompte(Compte c, Long codeClient, Long codeEmploye, Long idBanque) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Client cl = ss.get(Client.class, codeClient);
		c.setClient(cl);
		Employe em = ss.get(Employe.class,codeEmploye);
		c.setEmploye(em);
		Banque ba = ss.get(Banque.class, idBanque);
		c.setBanque(ba);
		ss.save(c);
		ss.getTransaction().commit();
		ss.close();
		log.info("------Le compte numero : "+c.getNumero()+" ayant pour client : "+cl.getNomClient()+" "+cl.getPrenomClient()+
				" a bien été ajouté par l'employé : "+em.getNomEmploye()+" pour la banque : "+ba.getNomAgence()+"------");
		return c;
	}

	@Override
	public Compte deleteCompte(Long numero) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Compte co = ss.get(Compte.class, numero);
		ss.delete(co);
		ss.getTransaction().commit();
		ss.close();
		log.info("------Le compte numero : "+numero+" a bien été supprimé------");
		return co;
	}

	@Override
	public Compte getCompte(Long numero) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Compte co = ss.get(Compte.class, numero);
		ss.getTransaction().commit();
		ss.close();
		log.info("------Le compte numero : "+numero+" a bien été récupéré");
		return co;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Compte> getComptesParClient(Long codeClient) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from compte c where c.idClient = x");
		query.setParameter("x", codeClient);
		ss.getTransaction().commit();
		log.info("------La liste des comptes du client numero : "+codeClient+" a bien été récupérée------");
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Compte> getComptesParEmploye(Long codeEmploye) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from compte c where c.idEmploye = x");
		query.setParameter("x", codeEmploye);
		ss.getTransaction().commit();
		log.info("------La liste des comptes créés par l'employé numero : "+codeEmploye+" a bien été récupérée------");
		return query.list();
	}

	@Override
	public Compte modifierRenseignement(Compte c) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		ss.saveOrUpdate(c);
		ss.getTransaction().commit();
		ss.close();
		log.info("------Le compte numero : "+c.getNumero()+" a bien été modifié------");
		return c;
	}


}
