package com.groupe4.gestiondesbanques.dao.employe;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Employe;
import com.groupe4.gestiondesbanques.entity.Groupe;
/**
 * Nom de l'interface : IDaoEmploye
 * package com.groupe4.gestiondesbanques.dao.employe;
 * @author Gr�goire RAYNAUD
 * Date : 30/06/2016
 */
public interface IDaoEmploye {

	/**
	 * Fonction pour ajouter un employ�
	 * @param e
	 * @return Employe
	 */
	public Employe addEmploye(Employe e);
	/**
	 * Fonction pour ajouter un employ� � un groupe
	 * @param e
	 * @param codeGroupe
	 * @return Employe
	 */
	public Employe addEmployetoGroupe(Employe e, Groupe g);
	/**
	 * Fonction pour r�cup�rer un employ�
	 * @param codeGroupe
	 * @return Employe
	 */
	public Employe getEmploye(Long codeEmploye);
	/**
	 * Fontion pour r�cup�rer tous les employ�s
	 * @return List<Employe>
	 */
	public List<Employe> getAllEmployes();
	/**
	 * Fonction pour r�cup�rer tous les employ�s d'un groupe
	 * @param codeGroupe
	 * @return
	 */
	public List<Employe> getEmployesFromGroupe(Long codeGroupe);
	/**
	 * Fonction pour r�cup�rer tous les employ�s d'une banque
	 * @param idBanque
	 * @return
	 */
	public List<Employe> getEmployesFromBanque(Long idBanque);
	
}
