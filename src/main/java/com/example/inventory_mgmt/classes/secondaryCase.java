package com.example.inventory_mgmt.classes;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class secondaryCase {
    @Id
    private int sCaseid;
    private int pCaseQty;

    public secondaryCase() {
    }

    public secondaryCase(int sCaseid, int pCaseQty) {
        this.sCaseid = sCaseid;
        this.pCaseQty = pCaseQty;
    }

    public int getsCaseid() {
        return sCaseid;
    }

    public void setsCaseid(int sCaseid) {
        this.sCaseid = sCaseid;
    }

    public int getpCaseQty() {
        return pCaseQty;
    }

    public void setpCaseQty(int pCaseQty) {
        this.pCaseQty = pCaseQty;
    }
}
