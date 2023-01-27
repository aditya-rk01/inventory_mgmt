package com.example.inventory_mgmt.services;

import com.example.inventory_mgmt.classes.secondaryCase;
import com.example.inventory_mgmt.dao.jpa.secondaryCaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class secondaryCaseService {
    @Autowired
    private secondaryCaseDao sCase_Dao;

    public List<secondaryCase> getAllsCases() {
        return sCase_Dao.findAll();
    }

    public secondaryCase getsCasebyId(int sCaseId){
        return sCase_Dao.findById(sCaseId).get();
    }

    public void addsCase(secondaryCase a_sCase){
        sCase_Dao.save(a_sCase);
    }

    public void delsCase(int sCaseId){
        sCase_Dao.deleteById(sCaseId);
    }
}
