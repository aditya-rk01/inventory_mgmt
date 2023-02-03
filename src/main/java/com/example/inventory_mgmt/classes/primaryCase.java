package com.example.inventory_mgmt.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class primaryCase {
    @Id
    private int pCaseId;
    private int invItemQty;
    private int sku;
    private int capacity;
    private int sCaseId;
}
