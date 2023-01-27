package com.example.inventory_mgmt.dao.jpa;

import com.example.inventory_mgmt.classes.primaryCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface primaryCaseDao extends JpaRepository<primaryCase, Integer> {
}
