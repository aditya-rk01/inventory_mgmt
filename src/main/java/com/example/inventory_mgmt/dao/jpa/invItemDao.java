package com.example.inventory_mgmt.dao.jpa;

import com.example.inventory_mgmt.classes.invItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface invItemDao extends JpaRepository<invItem, Integer> {
}
