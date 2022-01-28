package com.medikare.repository;

import java.util.List;

import com.medikare.model.Purchase;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase,Long> {
     public List<Purchase> findByUser_Username(String username);
}
