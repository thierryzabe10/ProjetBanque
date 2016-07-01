package com.groupe4.gestiondesbanques.service.operation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import com.groupe4.gestiondesbanques.dao.compte.IDaoCompte;
import com.groupe4.gestiondesbanques.dao.employe.IDaoEmploye;
import com.groupe4.gestiondesbanques.dao.operation.IDaoOperation;
import com.groupe4.gestiondesbanques.entity.Compte;
import com.groupe4.gestiondesbanques.entity.Employe;
import com.groupe4.gestiondesbanques.entity.Operation;
import com.groupe4.gestiondesbanques.entity.Retrait;
import com.groupe4.gestiondesbanques.entity.Versement;
import com.groupe4.gestiondesbanques.exception.RetraitException;
import com.groupe4.gestiondesbanques.exception.VersementException;

public class ServiceOperationImpl implements IServiceOperation {
	private IDaoOperation daoOperation;
	private IDaoCompte daoCompte;
	@SuppressWarnings("unused")
	private IDaoEmploye daoEmploye;
	Logger log = Logger.getLogger("ServiceOperationImpl");

	

	public void setDaoOperation(IDaoOperation daoOperation) {
		log.info("<----------daoOperation injected-------->");
		this.daoOperation = daoOperation;
	}

	public void setDaoCompte(IDaoCompte daoCompte) {
		log.info("<----------daoCompte injected-------->");
		this.daoCompte = daoCompte;
	}

	public void setDaoEmploye(IDaoEmploye daoEmploye) {
		log.info("<----------daoEmploye injected-------->");
		this.daoEmploye = daoEmploye;
	}

	public void setLog(Logger log) {
		this.log = log;
	}


	

	@Override
	public boolean verser(Long numero, double montant, Long codeEmploye) throws ParseException {
		
		Compte cp=daoCompte.getCompte(numero);
		if (cp==null) {
			try {
				throw new VersementException("le compte n'existe pas");
			} catch (VersementException e1) {
				e1.printStackTrace();
			}
		}
		
		daoOperation.addOperation(new Versement(new Date(), montant), numero, codeEmploye);
		cp.setSolde(cp.getSolde()+montant);
		return true;
		

	}

	@Override
	public boolean retirer(Long numero, double montant, Long codeEmploye) {
		Compte cp=daoCompte.getCompte(numero);
		if (cp.getSolde()<montant) {
			try {
				throw new RetraitException("le solde est insuffisant!");
			} catch (RetraitException e1) {
				e1.printStackTrace();
			}
		}
		daoOperation.addOperation(new Retrait(new Date(), montant), numero, codeEmploye);
		cp.setSolde(cp.getSolde()+montant);
		return true;

		
	}

	@Override
	public boolean virement(Long numeroCpte1, Long numeroCpte2, double montant,
			Long codeEmploye) throws ParseException {
		retirer(numeroCpte1, montant, codeEmploye);
		verser(numeroCpte2, montant, codeEmploye);
		log.info("Le virement de "+" "+ montant+ "effectué par l'employé"+ codeEmploye+ "a été enregistré");
		return true;

	}


}
