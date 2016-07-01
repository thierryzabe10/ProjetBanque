package com.groupe4.gestiondesbanques.service.client;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Client;

public interface IServiceClient {
	//m�thode permettant d'ajouter un client
	public Client addClient(Client c);
	//m�thode qui permet de supprimer un client
	public Client deleteClient(Long idClient);
	//m�thode qui permet de modofier un 
	public Client updateClient(Client c);
	//r�cup�rer un client de la base de donn�e
	public Client getOneclient(Long codeClient);
	//m�thode permettant de r�cup�rer la liste par mot cl�
	public List<Client> getListClientParMotCle(String mc);
	//m�thode pour r�cup�rer la des clients d'une banque
	public List<Client> getListClientParBanque(Long idBanque);
	//r�cup�rer la liste de tous les clients de la base de donn�e
	public List<Client>getClients();

}
