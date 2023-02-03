package com.example.inventory_mgmt.controllers;

import com.example.inventory_mgmt.classes.invItem;
import com.example.inventory_mgmt.classes.primaryCase;
import com.example.inventory_mgmt.services.invItemService;
import com.example.inventory_mgmt.services.primaryCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class primaryCaseController {
    @Autowired
    private primaryCaseService pCase_Serv;

    @GetMapping("getall-pCase")
    public List<primaryCase> getAllpCases() {
        return pCase_Serv.getAllpCases();
    }

    @GetMapping("get-pCase/{pCaseId}")
    public primaryCase getpCase(@PathVariable int pCaseId){
        return pCase_Serv.getpCasebyId(pCaseId);
    }

    @PostMapping("insert-pCase")
    public void addpCase(@RequestBody primaryCase a_pCase){ pCase_Serv.addpCase(a_pCase); }

    @DeleteMapping("delete-pCase/{pCaseId}")
    public void delpCase(Integer pCaseId){
        pCase_Serv.delpCase(pCaseId);
    }

}
