package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Family;

public interface Familyrepo extends JpaRepository<Family,Long> {
     // Wallet findwalletbyname(String name);

	

}
