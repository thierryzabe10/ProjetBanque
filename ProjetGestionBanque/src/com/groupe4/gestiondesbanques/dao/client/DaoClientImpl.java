package com.groupe4.gestiondesbanques.dao.client;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.groupe4.gestiondesbanques.dao.singleton.Singleton;
import com.groupe4.gestiondesbanques.entity.Client;

public class DaoClientImpl implements IDaoClient{

	Logger log = Logger.getLogger("DaoClientImpl");
	SessionFactory sf = Singleton.getSessionfactory();
	@Override
	public Client addClient(Client c) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		ss.save(c);
		ss.getTransaction().commit();ss.close();
		log.info("le client"+c.getNomClient()+" a bien été enregistré");
		return c;
	}

	@Override
	public Client deleteClient(Long idClient) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Client c = ss.get(Client.class, idClient);
		ss.delete(c);
		ss.getTransaction().commit();ss.close();
		log.info("le client"+c.getNomClient()+" a bien été suprimmé");
		return c;
	}

	@Override
	public Client updateClient(Client c) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		ss.saveOrUpdate(c);
		ss.getTransaction().commit();ss.close();
		log.info("le client"+c.getCodeClient()+" a bien été modifié");
		return c;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> getClients() {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from Client c ");
		ss.getTransaction().commit();
		log.info("ils existe"+query.list().size()+" clients");
		return query.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> getListClientParMotCle(String mc) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from Client c where c.nomClient like :x");
		query.setParameter("x","%"+mc+"%");
		ss.getTransaction().commit();
		log.info("ils existe"+query.list().size()+" clients");
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> getListClientParBanque(Long idBanque) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from Client c join on Banque b on c.idClient=b.idClient");
		ss.getTransaction().commit();
		log.info("ils existe"+query.list().size()+" clients");
		return query.list();
	}

	@Override
	public Client getOneclient(Long codeClient) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Client c = ss.get(Client.class, codeClient);
		ss.getTransaction().commit();ss.close();
		return c;
	}

}
