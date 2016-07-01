package com.groupe4.gestiondesbanques.dao.employe;

import java.util.List;

import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.groupe4.gestiondesbanques.dao.singleton.Singleton;
import com.groupe4.gestiondesbanques.entity.Employe;
import com.groupe4.gestiondesbanques.entity.Groupe;

/**
 * Nom de la classe : DaoEmployeImpl
 * Impl�mente IDaoEmploye
 * package com.groupe4.gestiondesbanques.dao.employe;
 * @author Gr�goire RAYNAUD
 * Date : 30/06/2016
 */
public class DaoEmployeImpl implements IDaoEmploye{

	Logger log = Logger.getLogger("DaoEmployeImpl");
	SessionFactory sf = Singleton.getSessionfactory();
	@Override
	public Employe addEmploye(Employe e) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		ss.save(e);
		ss.getTransaction().commit();
		ss.close();
		log.info("------L'employ� : "+e.getNomEmploye()+" a bien �t� ajout�------");
		return e;
	}
	@Override
	public Employe addEmployetoGroupe(Employe e, Groupe g) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		g.getListeDesEmployes().add(e);
		ss.saveOrUpdate(g);
		e.getListeDesGroupes().add(g);
		ss.saveOrUpdate(e);
		ss.getTransaction().commit();
		ss.close();
		log.info("------L'employ� : "+e.getNomEmploye()+" a bien �t� ajout� au groupe : "+g.getNomGroupe()+"------");
		return e;
	}
	@Override
	public Employe getEmploye(Long codeEmploye) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Employe e = ss.get(Employe.class, codeEmploye);
		ss.getTransaction().commit();
		log.info("------L'employ� : "+codeEmploye+" a bien �t� r�cup�r�------");
		return e;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employe> getAllEmployes() {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from Employe");
		ss.getTransaction().commit();
		log.info("------La liste des employ�s a bien �t� r�cup�r�e------");
		return query.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employe> getEmployesFromGroupe(Long codeGroupe) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from Employe e join EMP_GRPE eg on eg.codeEmploye = e.codeEmploye  and eg.codeGroupe = x");
		query.setParameter("x", codeGroupe);
		ss.getTransaction().commit();
		log.info("------La liste des employ�s du groupe "+codeGroupe+" a bien �t� r�cup�r�e------");
		return query.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employe> getEmployesFromBanque(Long idBanque) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from Employe e join Compte c on c.codeEmploye = e.codeEmploye  and c.idBanque = x");
		query.setParameter("x", idBanque);
		ss.getTransaction().commit();
		log.info("------La liste des employ�s de la banque "+idBanque+" a bien �t� r�cup�r�e------");
		return query.list();
	}

}
