package com.groupe4.gestiondesbanques.dao.employe;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Employe;
import com.groupe4.gestiondesbanques.entity.Groupe;
/**
 * Nom de l'interface : IDaoEmploye
 * package com.groupe4.gestiondesbanques.dao.employe;
 * @author Grégoire RAYNAUD
 * Date : 30/06/2016
 */
public interface IDaoEmploye {

	/**
	 * Fonction pour ajouter un employé
	 * @param e
	 * @return Employe
	 */
	public Employe addEmploye(Employe e);
	/**
	 * Fonction pour ajouter un employé à un groupe
	 * @param e
	 * @param codeGroupe
	 * @return Employe
	 */
	public Employe addEmployetoGroupe(Employe e, Groupe g);
	/**
	 * Fonction pour récupérer un employé
	 * @param codeGroupe
	 * @return Employe
	 */
	public Employe getEmploye(Long codeEmploye);
	/**
	 * Fontion pour récupérer tous les employés
	 * @return List<Employe>
	 */
	public List<Employe> getAllEmployes();
	/**
	 * Fonction pour récupérer tous les employés d'un groupe
	 * @param codeGroupe
	 * @return
	 */
	public List<Employe> getEmployesFromGroupe(Long codeGroupe);
	/**
	 * Fonction pour récupérer tous les employés d'une banque
	 * @param idBanque
	 * @return
	 */
	public List<Employe> getEmployesFromBanque(Long idBanque);
	
}
