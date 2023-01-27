package com.example.inventory_mgmt.controllers;

import com.example.inventory_mgmt.classes.invItem;
import com.example.inventory_mgmt.dao.jpa.invItemDao;
import com.example.inventory_mgmt.services.invItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class invItemController {
    @Autowired
    private invItemService invItem_Serv;

    @GetMapping("getall")
    public List<invItem> getAllInvItems() {
        return invItem_Serv.getAllInvItems();
    }

    @GetMapping("get/{invId}")
    public invItem getInvItembyId(int invId){
        return invItem_Serv.getInvItembyId(invId);
    }

    @PostMapping("insert")
    public void addInvItem(@RequestBody invItem a_invItem){
        invItem_Serv.addInvItem(a_invItem);
    }

    @DeleteMapping("delete/{invId}")
    public void delInvItem(Integer invId){
        invItem_Serv.delInvItem(invId);
    }

}
