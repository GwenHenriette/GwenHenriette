package com.A2.controller;

import com.A2.model.Clients217;
import com.A2.model.Lines217;
import com.A2.service.ClientService217;
import com.A2.service.LinesService217;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/lines")
public class LinesController217 {

    @Autowired
    private LinesService217 linesService217;

    @GetMapping ("/getAllLines")
    public List<Lines217> getAllLines217(){
        return linesService217.getAllLines217();
    }

    @GetMapping("/getClient")
    public Lines217 getLinesById(@RequestParam Integer lineNo){
        return linesService217.getAllLines217().get(lineNo);
    }

    @PostMapping("/addClient")
    public void addLine217(@RequestBody Lines217 lines217){
        linesService217.addLines217(lines217);
    }

    @PutMapping("/updateLines/{id}")
    public void updateLines217(@PathVariable int id, @RequestBody Lines217 lines217){
        linesService217.updateLines217(lines217);
    }

    @DeleteMapping("/deleteClients/{id}")
    public void deleteLines217(@PathVariable int id){
        linesService217.deleteLines217(id);
    }
}
