package com.ust.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.client.model.Product;

@Repository
public interface clientRepository extends JpaRepository<Product,Long>
{

}
