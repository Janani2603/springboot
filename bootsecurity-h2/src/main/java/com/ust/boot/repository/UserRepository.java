package com.ust.boot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.boot.service.MyUser;


@Repository
public interface UserRepository extends JpaRepository<MyUser,Long>  {
	Optional<MyUser> findByUsername(String username);

}
