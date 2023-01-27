package com.example.inventory_mgmt.services;

import com.example.inventory_mgmt.classes.invItem;
import com.example.inventory_mgmt.dao.jpa.invItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class invItemService {

    @Autowired
    private invItemDao invItem_Dao;
    public List<invItem> getAllInvItems() {
        return invItem_Dao.findAll();
    }

    public invItem getInvItembyId(int invId){
        return invItem_Dao.findById(invId).get();
    }

    public void addInvItem(invItem a_invItem){
        invItem_Dao.save(a_invItem);
    }

    public void delInvItem(Integer invId){
        invItem_Dao.deleteById(invId);
    }

}
