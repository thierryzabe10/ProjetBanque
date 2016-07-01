package com.groupe4.gestiondesbanques.service.groupe;

import java.util.List;
import java.util.logging.Logger;

import com.groupe4.gestiondesbanques.dao.groupe.IDaoGroupe;
import com.groupe4.gestiondesbanques.entity.Groupe;

import java.util.List;

import org.apache.log4j.Logger;

import com.groupe4.gestiondesbanques.dao.groupe.IDaoGroupe;
import com.groupe4.gestiondesbanques.entity.Groupe;

public class ServiceGroupeImpl implements IServiceGroupe{
	private IDaoGroupe daoGroupe;
	Logger log= Logger.getLogger("ServiceGroupeImpl");
	
	public void setDaoGroupe(IDaoGroupe daoGroupe) {
		this.daoGroupe = daoGroupe;
		log.info("<--------- daoGroupe injected --->");
	}


	@Override
	public Groupe AjouterUnGroupe(Groupe g) {
		
		return daoGroupe.AjouterUnGroupe(g);
	}

	@Override
	public List<Groupe> ConsulterLaListeDesGroupes() {
		return daoGroupe.ConsulterLaListeDesGroupes();
	}

}
