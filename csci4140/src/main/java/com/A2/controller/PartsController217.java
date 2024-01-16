package com.A2.controller;

import com.A2.model.Parts217;
import com.A2.service.PartsService217;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/parts")
public class PartsController217 {
    private final PartsService217 partsService;


    @Autowired
    public PartsController217(PartsService217 partsService) {
        this.partsService = partsService;
    }

    @GetMapping("/getAllparts")
    public List<Parts217> getAllParts217() {
        return partsService.getAllParts217();
    }

    @PostMapping("/addParts")
    public void addParts217(@RequestBody Parts217 parts217) {
        partsService.addParts217(parts217);
    }

    @GetMapping("/getParts")
    public Parts217 getPartById217(@RequestParam Integer partNo) {
        return partsService.getPartById217(partNo);
    }

    @PutMapping("/updateParts/{id}")
    public void updateParts217(@PathVariable int id, @RequestBody Parts217 parts217) {
        partsService.updateParts217(id, parts217);
    }

    @DeleteMapping("/deleteParts/{id}")
    public void deleteParts217(@PathVariable int id) {
        partsService.deleteParts217(id);
    }

}
