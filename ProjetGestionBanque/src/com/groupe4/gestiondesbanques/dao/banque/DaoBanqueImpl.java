package com.groupe4.gestiondesbanques.dao.banque;

import java.util.List;






import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.groupe4.gestiondesbanques.dao.singleton.Singleton;
import com.groupe4.gestiondesbanques.entity.Banque;
import com.groupe4.gestiondesbanques.entity.Compte;


public class DaoBanqueImpl implements IdaoBanque{
	
	
	Logger log = Logger.getLogger("DaoBanqueImpl");
	SessionFactory sf = Singleton.getSessionfactory();

	@Override
	public Banque AjouterUneBanque(Banque b) {
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(b);
		s.getTransaction().commit();
		s.close();
		log.info("La banque "+b.getIdBanque()+" de l'agence: "+b.getNomAgence()+" a bien été ajouté !");	
		return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Compte> GetListCompteFromBanque(Long idBanque) {
		Session s=sf.openSession();
		s.beginTransaction();
		Query query= s.createQuery(" from Compte c join Banque b on c.idBanque=b.idBanque like :x ");
		query.setLong("x", idBanque);
		s.getTransaction().commit();
		log.info("La liste de compte de la banque: "+idBanque+" s'affiche ");
		return query.list();
	}

	@Override
	public void addCompteToBanque(Long numero, Long idBanque) {
		Session s=sf.openSession();
		s.beginTransaction();
		Compte c=s.get(Compte.class, numero);
		Banque b=s.get(Banque.class, idBanque);
		c.setBanque(b);
		b.getListeDesComptes().add(c);
		s.getTransaction().commit();
		log.info("Le compte: "+c.getNumero()+" a été ajouté à la banque: "+b.getIdBanque());
		
	}

	
	
	

}
