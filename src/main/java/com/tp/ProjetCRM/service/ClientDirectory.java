package com.tp.ProjetCRM.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tp.ProjetCRM.dao.ClientRepository;
import com.tp.ProjetCRM.model.Client;

@Service
public class ClientDirectory {

	@Autowired
	private ClientRepository clientRepository;
	
	public void addClient(Client newClient) {

		clientRepository.save(newClient);
	}
	
	public List<Client> getClients(){
		return clientRepository.findAll();
	}

	public Optional<Client> getClient(Long id) {
		return clientRepository.findById(id);
	}

	public void deleteClient(Long id){
		clientRepository.deleteById(id);
	}

	public void updateClient(Client clientToUpdate, Long id){
		clientRepository.save(clientToUpdate);
	}

	public void patchClient(Client clientToUpdate, Long id){
		Optional<Client> op = clientRepository.findById(id);
		if(op.isPresent()){
			Client client = op.get();
			client.patch(clientToUpdate);
			clientRepository.save(client);
		}
	}
}
