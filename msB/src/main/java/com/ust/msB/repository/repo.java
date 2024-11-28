package com.ust.msB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.msB.model.familt;

@Repository
public interface repo extends JpaRepository<familt,Long> {

}
