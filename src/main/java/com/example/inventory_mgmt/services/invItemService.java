package com.example.inventory_mgmt.services;

import com.example.inventory_mgmt.classes.invItem;
import com.example.inventory_mgmt.dao.jdbc.invItemDaoJdbc;
import com.example.inventory_mgmt.dao.jpa.invItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class invItemService {

    @Autowired
    private invItemDao invItem_Dao;

    @Autowired
    private invItemDaoJdbc invItem_DaoJdbc;

    public List<invItem> getAllInvItems() {
        return invItem_DaoJdbc.getAll();
    }

    public invItem getInvItembyId(Integer invId){ return invItem_DaoJdbc.getinvItemById(invId); }

    public void addInvItem(invItem a_invItem){
        int no=invItem_DaoJdbc.check(a_invItem.getSku(), a_invItem.getQty());
        System.out.println(no);
        List<invItem> allInvItems = getAllInvItems();
        int i=0;
        for(i=0; i<allInvItems.size(); ++i){
            if(allInvItems.get(i).getSku()==a_invItem.getSku()){
                a_invItem.setPCases(allInvItems.get(i).getPCases());
                break;
            }
        }
        System.out.println(i);
        if(i==allInvItems.size()){
            a_invItem.setPCases(new ArrayList<>());
        }
        else{
            a_invItem.setQty(allInvItems.get(i).getQty()+a_invItem.getQty());
        }
        if(no!=-1) {
            a_invItem.getPCases().add((no));
        }
        //System.out.println(a_invItem.getpCases());
        invItem_Dao.save(a_invItem);
    }

    public void delInvItem(Integer invId){
        invItem_Dao.deleteById(invId);
    }

}
