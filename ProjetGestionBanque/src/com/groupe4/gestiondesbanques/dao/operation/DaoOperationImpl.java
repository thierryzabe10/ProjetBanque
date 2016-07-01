package com.groupe4.gestiondesbanques.dao.operation;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.groupe4.gestiondesbanques.dao.singleton.Singleton;
import com.groupe4.gestiondesbanques.entity.Compte;
import com.groupe4.gestiondesbanques.entity.Employe;
import com.groupe4.gestiondesbanques.entity.Operation;

/**
 * 
 * @author inti0298
 *classe : Op�ration de la couche Dao
 */
public class DaoOperationImpl implements IDaoOperation{
	Logger log = Logger.getLogger("DaoOperationImpl");
	SessionFactory sf = Singleton.getSessionfactory();

	public Operation addOperation(Operation o) {

		Session ss = sf.openSession();
		ss.beginTransaction();
		ss.save(o);
		ss.getTransaction().commit();ss.close();
		log.info("l'op�ration"+o.getNumeroOperation()+" a bien �t� enregistr�e");
		return o;

	}

	@Override
	public Operation addOperation(Operation o, Long numero, Long codeEmploye) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Compte c = ss.get(Compte.class, numero);
		Employe e = ss.get(Employe.class, codeEmploye);
		o.setCompte(c);
		ss.save(o);
		ss.getTransaction().commit();ss.close();
		log.info("l'op�ration"+o.getNumeroOperation()+" a bien �t� enregistr�e");
		return o;
	}

}
