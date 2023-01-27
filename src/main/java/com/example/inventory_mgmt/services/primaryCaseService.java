package com.example.inventory_mgmt.services;

import com.example.inventory_mgmt.classes.primaryCase;
import com.example.inventory_mgmt.dao.jpa.primaryCaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class primaryCaseService {
    @Autowired
    private primaryCaseDao pCase_Dao;

    public List<primaryCase> getAllpCases() {
        return pCase_Dao.findAll();
    }

    public primaryCase getpCasebyId(int pCaseId){
        return pCase_Dao.findById(pCaseId).get();
    }

    public void addpCase(primaryCase a_pCase){
        pCase_Dao.save(a_pCase);
    }

    public void delpCase(int pCaseId){
        pCase_Dao.deleteById(pCaseId);
    }
}
