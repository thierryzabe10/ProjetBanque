package com.groupe4.gestiondesbanques.service.employe;

import java.util.List;

import org.apache.log4j.Logger;

import com.groupe4.gestiondesbanques.dao.employe.IDaoEmploye;
import com.groupe4.gestiondesbanques.entity.Employe;
import com.groupe4.gestiondesbanques.entity.Groupe;

public class ServiceEmployeImpl implements IServiceEmploye {

	private IDaoEmploye daoemploye;
	Logger log = Logger.getLogger("ServiceEmployeImpl");
	
	public void setDaoemploye(IDaoEmploye daoemploye) {
		this.daoemploye = daoemploye;
	}

	@Override
	public Employe addEmploye(Employe e) {
		// TODO Auto-generated method stub
		return this.daoemploye.addEmploye(e);
	}

	@Override
	public Employe addEmployetoGroupe(Employe e, Groupe g) {
		// TODO Auto-generated method stub
		return this.daoemploye.addEmployetoGroupe(e, g);
	}

	@Override
	public Employe getEmploye(Long codeEmploye) {
		// TODO Auto-generated method stub
		return this.daoemploye.getEmploye(codeEmploye);
	}

	@Override
	public List<Employe> getAllEmployes() {
		// TODO Auto-generated method stub
		return this.daoemploye.getAllEmployes();
	}

	@Override
	public List<Employe> getEmployesFromGroupe(Long codeGroupe) {
		// TODO Auto-generated method stub
		return this.daoemploye.getEmployesFromGroupe(codeGroupe);
	}

	@Override
	public List<Employe> getEmployesFromBanque(Long idBanque) {
		// TODO Auto-generated method stub
		return this.daoemploye.getEmployesFromBanque(idBanque);
	}

}
