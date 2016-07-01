package com.groupe4.gestiondesbanques.service.client;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Client;

public interface IServiceClient {
	//méthode permettant d'ajouter un client
	public Client addClient(Client c);
	//méthode qui permet de supprimer un client
	public Client deleteClient(Long idClient);
	//méthode qui permet de modofier un 
	public Client updateClient(Client c);
	//récupérer un client de la base de donnée
	public Client getOneclient(Long codeClient);
	//méthode permettant de récupérer la liste par mot clé
	public List<Client> getListClientParMotCle(String mc);
	//méthode pour récupérer la des clients d'une banque
	public List<Client> getListClientParBanque(Long idBanque);
	//récupérer la liste de tous les clients de la base de donnée
	public List<Client>getClients();

}
