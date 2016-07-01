package com.groupe4.gestiondesbanques.dao.groupe;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.groupe4.gestiondesbanques.dao.singleton.Singleton;
import com.groupe4.gestiondesbanques.entity.Groupe;

import com.groupe4.gestiondesbanques.entity.Employe;

public class DaoGroupeImpl implements IDaoGroupe{
	
	Logger log = Logger.getLogger("DaoGroupeImpl");
	SessionFactory sf = Singleton.getSessionfactory();
	@Override
	public Groupe AjouterUnGroupe(Groupe g) {
		Session s =sf.openSession();
		s.beginTransaction();
		s.save(g);
		s.getTransaction().commit();
		s.close();
		log.info("Le groupe: "+g.getNomGroupe()+" a bient été ajouté ! ");
		return g;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Groupe> ConsulterLaListeDesGroupes() {
		Session s = sf.openSession();
		s.beginTransaction();
		Query query= s.createQuery("from Groupe g");
		s.getTransaction().commit();
		log.info("Il existe: "+query.list().size()+" groupes !");
		return query.list();
	}
	@Override
	public void AddEmployeToGroupe(Long codeEmploye, Long codeGroupe) {
		Session s = sf.openSession();
		s.beginTransaction();
		Employe e=s.get(Employe.class, codeEmploye);
		Groupe g=s.get(Groupe.class, codeGroupe);
		e.getListeDesGroupes().add(g);
		g.getListeDesEmployes().add(e);
		s.save(g);
		s.save(e);
		s.getTransaction().commit();
		log.info("L'employé "+e.getCodeEmploye()+" est ajouté au groupe"+g.getCodeGroupe());
		
	}
	
	
	

}
