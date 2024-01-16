package com.A2.service;

import com.A2.model.Clients217;
import com.A2.repository.ClientsRepository217;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService217 {
    @Autowired
    public ClientsRepository217 clientsRepository217;

    public List<Clients217> getAllClients217(){
        List<Clients217> clients = new ArrayList<>();
        clientsRepository217.findAll().forEach(clients::add);
        return clients;
    }

    public void addClients217(Clients217 clients217){
        clientsRepository217.save(clients217);
    }

    public void updateClients217(int Id, Clients217 clients217){
        clientsRepository217.save(clients217);
    }

    public void deleteClients217(int Id){
        clientsRepository217.deleteById(Id);
    }

    public Clients217 getClientsById(int Id){
        return clientsRepository217.findById(Id).orElse(null);
    }
}
