package com.groupe4.gestiondesbanques.dao.client;

import java.util.List;

import com.groupe4.gestiondesbanques.entity.Client;
/**
 * 
 * @author inti0298
 *Interface : classe Client de la couche dao
 *version:1.0.0
 */
public interface IDaoClient {
	public Client addClient(Client c);
	public Client deleteClient(Long idClient);
	public Client updateClient(Client c);
	public Client getOneclient(Long codeClient);
	public List<Client> getListClientParMotCle(String mc);
	public List<Client> getListClientParBanque(Long idBanque);
	public List<Client>getClients();

}
