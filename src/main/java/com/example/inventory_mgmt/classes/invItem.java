package com.example.inventory_mgmt.classes;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class invItem {
    @Id
    private int sku;
    private int qty;
    @Column(name = "pCases")
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> pCases;
    private int sCaseId;

    public invItem() {
    }

    public invItem(int sku, int qty, List<Integer> pCases, int sCaseId) {
        this.sku = sku;
        this.qty = qty;
        this.pCases = pCases;
        this.sCaseId = sCaseId;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<Integer> getpCases() {
        return pCases;
    }

    public void setpCases(List<Integer> pCases) {
        this.pCases = pCases;
    }

    public int getsCaseId() {
        return sCaseId;
    }

    public void setsCaseId(int sCaseId) {
        this.sCaseId = sCaseId;
    }
}
