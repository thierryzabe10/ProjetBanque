package com.groupe4.gestiondesbanques.service.client;

import java.util.List;
import java.util.logging.Logger;

import com.groupe4.gestiondesbanques.dao.client.IDaoClient;
import com.groupe4.gestiondesbanques.entity.Client;

public class ServiceClientImpl implements IServiceClient{
	private IDaoClient daoClient;
	Logger log = Logger.getLogger("ServiceClientImpl");

	

	public void setDaoClient(IDaoClient daoClient) {
		this.daoClient = daoClient;
		log.info("<----------daoClient injected-------->");
	}

	@Override
	public Client addClient(Client c) {
		return daoClient.addClient(c);
	}

	@Override
	public Client deleteClient(Long idClient) {
		return daoClient.deleteClient(idClient);
	}

	@Override
	public Client updateClient(Client c) {
		return daoClient.updateClient(c);
	}

	@Override
	public List<Client> getListClientParMotCle(String mc) {
		return daoClient.getListClientParMotCle(mc);
	}

	@Override
	public List<Client> getListClientParBanque(Long idBanque) {
		return daoClient.getListClientParBanque(idBanque);
	}

	@Override
	public List<Client> getClients() {
		return daoClient.getClients();
	}

	@Override
	public Client getOneclient(Long codeClient) {
		return daoClient.getOneclient(codeClient);
	}

}
