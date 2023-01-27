package com.example.inventory_mgmt.controllers;

import com.example.inventory_mgmt.classes.primaryCase;
import com.example.inventory_mgmt.classes.secondaryCase;
import com.example.inventory_mgmt.services.primaryCaseService;
import com.example.inventory_mgmt.services.secondaryCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class secondaryCaseController {
    @Autowired
    private secondaryCaseService sCase_Serv;

    @GetMapping("getall-sCase")
    public List<secondaryCase> getAllsCases() {
        return sCase_Serv.getAllsCases();
    }

    @GetMapping("get-sCase/{sCaseId}")
    public secondaryCase getsCase(int sCaseId){
        return sCase_Serv.getsCasebyId(sCaseId);
    }

    @PostMapping("insert-sCase")
    public void addsCase(@RequestBody secondaryCase a_sCase){ sCase_Serv.addsCase(a_sCase); }

    @DeleteMapping("delete-sCase/{sCaseId}")
    public void delsCase(Integer sCaseId){
        sCase_Serv.delsCase(sCaseId);
    }
}
