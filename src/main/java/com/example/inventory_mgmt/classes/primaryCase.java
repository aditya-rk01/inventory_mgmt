package com.example.inventory_mgmt.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class primaryCase {
    @Id
    private int pCaseId;
    private int invItemQty;
    private int sCaseId;
    public primaryCase() {
    }

    public primaryCase(int pCaseId, int invItemQty, int sCaseId) {
        this.pCaseId = pCaseId;
        this.invItemQty = invItemQty;
        this.sCaseId = sCaseId;
    }

    public int getpCaseId() {
        return pCaseId;
    }

    public void setpCaseId(int pCaseId) {
        this.pCaseId = pCaseId;
    }

    public int getInvItemQty() {
        return invItemQty;
    }

    public void setInvItemQty(int invItemQty) {
        this.invItemQty = invItemQty;
    }

    public int getsCaseId() {
        return sCaseId;
    }

    public void setsCaseId(int sCaseId) {
        this.sCaseId = sCaseId;
    }
}
