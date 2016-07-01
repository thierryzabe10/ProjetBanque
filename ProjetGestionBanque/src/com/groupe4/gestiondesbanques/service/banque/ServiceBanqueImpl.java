package com.groupe4.gestiondesbanques.service.banque;

import java.util.List;
import java.util.logging.Logger;

import com.groupe4.gestiondesbanques.dao.banque.IdaoBanque;
import com.groupe4.gestiondesbanques.entity.Banque;
import com.groupe4.gestiondesbanques.entity.Compte;

public class ServiceBanqueImpl implements IServiceBanque{
	private IdaoBanque daoBanque;
	Logger log = Logger.getLogger("ServiceClientImpl");

	public void setDaoBanque(IdaoBanque daoBanque) {
		log.info("<----------daoBanque injected-------->");
		this.daoBanque = daoBanque;
	}

	@Override
	public Banque AjouterUneBanque(Banque b) {
		return daoBanque.AjouterUneBanque(b);
	}

	@Override
	public List<Compte> GetListCompteFromBanque(Long idBanque) {
		return daoBanque.GetListCompteFromBanque(idBanque);
	}

	@Override
	public void addCompteToBanque(Long numero, Long idBanque) {
		
	}

}
