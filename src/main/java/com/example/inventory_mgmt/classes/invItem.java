package com.example.inventory_mgmt.classes;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class invItem {
    @Id
    private int sku;
    private int qty;
    @Column(name = "pCases")
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> pCases;
}
