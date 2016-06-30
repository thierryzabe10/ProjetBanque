package com.groupe4.gestiondesbanques.service.compte;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Compte;

/**
 * Nom de l'interface : IServiceCompte
 * package com.groupe4.gestiondesbanques.service.compte;
 * @author Gr�goire RAYNAUD
 * Date : 30/06/2016
 */
public interface IServiceCompte{

    /** Fonction pour ajouter un compte en sachant le client, l'employ� et la banque
	 * @param c
	 * @param idClient
	 * @param idEmploye
	 * @param idBanque
	 * @return Compte
	 */
	public Compte addCompte (Compte c,Long codeClient, Long codeEmploye, Long idBanque);
	/**
	 * Fonction pour supprimer un compte
	 * @param idCompte
	 * @return Compte
	 */
	public Compte deleteCompte (Long numero);
	/**
	 * Fonction pour consulter un compte
	 * @param idCompte
	 * @return Compte
	 */
	public Compte getCompte (Long numero);
	/**
	 * Fonction pour modifier les renseignements d'un compte
	 * @param c
	 * @return Compte
	 */
	public Compte modifierRenseignement(Compte c);
	/**
	 * Fonction pour consulter la liste des comptes d'un client
	 * @param idClient
	 * @return List<Client>
	 */
	public List<Compte> getComptesParClient (Long codeClient);
	/**
	 * Fonction pour consulter les comptes cr��s par un employ�
	 * @param idEmploye
	 * @return List<Compte>
	 */
	public List<Compte> getComptesParEmploye (Long codeEmploye);
	
	
}
