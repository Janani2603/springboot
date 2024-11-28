package com.ust.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.boot.model.Product;

@Repository
public interface Productrepository extends JpaRepository<Product,Long> {

}