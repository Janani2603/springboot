package com.ust.msA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.msA.model.product;

@Repository
public interface repo extends JpaRepository<product,Long>{

}
