package com.groupe4.gestiondesbanques.service.banque;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Banque;
import com.groupe4.gestiondesbanques.entity.Compte;

public interface IServiceBanque {
	public Banque AjouterUneBanque(Banque b);
	public List<Compte> GetListCompteFromBanque(Long idBanque);
	public void addCompteToBanque(Long numero, Long idBanque);
}
