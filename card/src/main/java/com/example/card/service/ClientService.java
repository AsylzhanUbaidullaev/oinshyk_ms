package com.example.card.service;

import com.example.card.model.Client;
import com.example.card.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;

    public Client create(Client client){
        return clientRepo.saveAndFlush(client);
    }

    public Client getById(Long id){
        return clientRepo.getById(id);
    }

    public List<Client> getAll(){
        return clientRepo.findAll();
    }

    public void delete(Long id){
        clientRepo.deleteById(id);
    }
    public Client subscribed(Long id){
        Client client=clientRepo.getById(id);
        client.setSubscription(true);
        return clientRepo.saveAndFlush(client);
    }
}
