package com.A2.service;

import com.A2.model.Lines217;
import com.A2.model.POs217;
import com.A2.model.Parts217;
import com.A2.repository.LinesRepository217;
import com.A2.repository.POsRepository217;
import com.A2.repository.PartsRepository217;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinesService217 {
    @Autowired
    private POsRepository217 pOsRepository217;

    @Autowired
    private PartsRepository217 partsRepository217;

    @Autowired
    public LinesRepository217 linesRepository217;

    public List<Lines217> getAllLines217(){
        List<Lines217> lines = new ArrayList<>();
        linesRepository217.findAll().forEach(lines::add);
        return lines;
    }

    public void addLines217(Lines217 lines217){
        linesRepository217.save(lines217);
    }

    public void updateLines217(Lines217 lines217){
        linesRepository217.save(lines217);
    }

    public void deleteLines217 (int Id){
        linesRepository217.deleteById(Id);
    }

    public Lines217 saveLines(Integer poNo, Integer partNo,int lineNo, Integer qty, double priceOrdered){
        POs217 pOs217 = pOsRepository217.findById(poNo).orElse(null);
        Parts217 parts217 = partsRepository217.findById(partNo).orElse(null);

        Lines217 lines217 = new Lines217(lineNo, priceOrdered, qty, poNo, partNo);
        return linesRepository217.save(lines217);
    }
}
