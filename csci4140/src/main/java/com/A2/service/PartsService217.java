package com.A2.service;

import com.A2.model.Parts217;
import com.A2.repository.PartsRepository217;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PartsService217 {
    @Autowired
    public PartsRepository217 partsRepository217;

    public List<Parts217> getAllParts217() {
        return new ArrayList<>((Collection) partsRepository217.findAll());
    }

    public void addParts217(Parts217 parts217) {
        partsRepository217.save(parts217);
    }

    public void updateParts217(int id, Parts217 updatedParts) {
        Parts217 existingParts = partsRepository217.findById(id).orElse(null);
        if (existingParts != null) {
            partsRepository217.save(existingParts);
        }
    }

    public void deleteParts217(int id) {
        partsRepository217.deleteById(id);
    }

    public Parts217 getPartById217(int id) {
        return partsRepository217.findById(id).orElse(null);
    }
}
