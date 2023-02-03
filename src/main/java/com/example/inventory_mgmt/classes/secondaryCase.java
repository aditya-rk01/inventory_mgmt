package com.example.inventory_mgmt.classes;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class secondaryCase {
    @Id
    private int sCaseId;
    private int pCaseQty;
}
