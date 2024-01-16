package com.A2.controller;

import com.A2.model.Clients217;
import com.A2.service.ClientService217;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/clients")
public class ClientsController217 {

    @Autowired
    private ClientService217 clientService217;

    @GetMapping ("/getAllClients")
    public List<Clients217> getAllClients217(){
        return clientService217.getAllClients217();
    }

    @GetMapping("/getClient")
    public Clients217 getClientsById(@RequestParam Integer clientId){
        return clientService217.getClientsById(clientId);
    }

    @PostMapping("/addClient")
    public void addClient217(@RequestBody Clients217 clients217){
        clientService217.addClients217(clients217);
    }

    @PutMapping("/updateClient/{id}")
    public void updateclients217(@PathVariable int id, @RequestBody Clients217 clients217){
        clientService217.updateClients217(id, clients217);
    }

    @DeleteMapping("/deleteClients/{id}")
    public void deleteClients217(@PathVariable int id){
        clientService217.deleteClients217(id);
    }
}
