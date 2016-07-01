package com.groupe4.gestiondesbanques.service.groupe;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Groupe;

public interface IServiceGroupe {
	
	// Ajoute un groupe
	public Groupe AjouterUnGroupe(Groupe g);
	// Consulte la liste de tout les groupes !
	public List<Groupe> ConsulterLaListeDesGroupes();
	//Ajoute un employe dans un compte
	public void AddEmployeToGroupe(Long codeEmploye,Long codeGroupe);

}
