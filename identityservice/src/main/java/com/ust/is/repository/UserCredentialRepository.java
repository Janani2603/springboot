package com.ust.is.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.is.entity.UserCredentials;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserCredentials,Integer> {
    Optional<UserCredentials> findByName(String username);
}
