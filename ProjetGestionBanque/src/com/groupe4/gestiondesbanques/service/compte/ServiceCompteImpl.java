package com.groupe4.gestiondesbanques.service.compte;

import java.util.List;

import java.util.logging.Logger;

import com.groupe4.gestiondesbanques.dao.compte.IDaoCompte;
import com.groupe4.gestiondesbanques.entity.Compte;

/**
 * Nom de la classe : ServiceCompteImpl
 * Implémente l'interface : IServiceCompte
 * package com.groupe4.gestiondesbanques.service.compte;
 * @author Grégoire RAYNAUD
 * Date : 30/06/2016
 */
public class ServiceCompteImpl implements IServiceCompte {

	private IDaoCompte daocompte;
	Logger log = Logger.getLogger("ServiceCompteImpl");
	
	public void setDaoCompte(IDaoCompte daoCompte) {
		this.daocompte = daoCompte;
		log.info("------------ dao injected ------------");
	}

	@Override
	public Compte addCompte(Compte c, Long codeClient, Long codeEmploye, Long idBanque) {
		// TODO Auto-generated method stub
		return this.daocompte.addCompte(c, codeClient, codeEmploye, idBanque);
	}

	@Override
	public Compte deleteCompte(Long numero) {
		// TODO Auto-generated method stub
		return this.daocompte.deleteCompte(numero);
	}

	@Override
	public Compte getCompte(Long numero) {
		// TODO Auto-generated method stub
		return this.daocompte.getCompte(numero);
	}

	@Override
	public Compte modifierRenseignement(Compte c) {
		// TODO Auto-generated method stub
		return this.daocompte.modifierRenseignement(c);
	}

	@Override
	public List<Compte> getComptesParClient(Long codeClient) {
		// TODO Auto-generated method stub
		return this.daocompte.getComptesParClient(codeClient);
	}

	@Override
	public List<Compte> getComptesParEmploye(Long codeEmploye) {
		// TODO Auto-generated method stub
		return this.daocompte.getComptesParEmploye(codeEmploye);
	}



}
