package com.A2.service;

import com.A2.model.POs217;
import com.A2.repository.POsRepository217;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class POsService217 {
    @Autowired
    public POsRepository217 pOsRepository217;

    public List<POs217> getAllPurchaseOrders217(){
        List<POs217> purchaseorders = new ArrayList<>();
        pOsRepository217.findAll().forEach(purchaseorders::add);
        return purchaseorders;
    }

    public void addPurchaseorders217(POs217 pOs217){
        pOsRepository217.save(pOs217);
    }

    public void updatePurchaseorders(int id, POs217 pOs217){
        pOsRepository217.save(pOs217);
    }

    public void deletePurchaseorders(int id){
        pOsRepository217.deleteById(id);
    }

}
