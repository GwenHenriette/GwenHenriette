package com.A2.controller;

import com.A2.model.POs217;
import com.A2.service.POsService217;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/PurchaseOrders")
public class POsController217 {
    @Autowired
    private POsService217 pOsService217;

    @GetMapping ("/getAllPurchaseOrders")
    public List<POs217> getAllPurchaseOrders217(){
        return pOsService217.getAllPurchaseOrders217();
    }

    @PostMapping("/addPurchaseOrders")
    public void addPurchaseOrders217(@RequestBody POs217 pOs217){
        pOsService217.addPurchaseorders217(pOs217);
    }

    @PutMapping("/updatePurchaseOrders/{id}")
    public void updatePurchaseOrders217(@PathVariable int id, @RequestBody POs217 pOs217){
        pOsService217.updatePurchaseorders(id, pOs217);
    }

    @DeleteMapping("/deletePurchaseOrders/{id}")
    public void deletePurchaseOrders217(@PathVariable int id){
        pOsService217.deletePurchaseorders(id);
    }

}
