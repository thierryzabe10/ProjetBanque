package com.groupe4.gestiondesbanques.dao.groupe;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Groupe;

public interface IDaoGroupe {
	public Groupe AjouterUnGroupe(Groupe g);
	public List<Groupe> ConsulterLaListeDesGroupes();
	public void AddEmployeToGroupe(Long codeEmploye, Long codeGroupe);
}
