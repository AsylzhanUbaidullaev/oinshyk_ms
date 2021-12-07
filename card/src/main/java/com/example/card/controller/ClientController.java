package com.example.card.controller;

import com.example.card.model.Client;
import com.example.card.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Client getById(@PathVariable Long id){
        return clientService.getById(id);
    }

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable  Long id){
        clientService.delete(id);
    }

    @RequestMapping(value = "/update/subscribe/{id}", method = RequestMethod.DELETE)
    public Client update(@PathVariable  Long id){
        return clientService.subscribed(id);
    }
}
