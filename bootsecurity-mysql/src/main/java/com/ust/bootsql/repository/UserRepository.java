package com.ust.bootsql.repository;
import com.ust.bootsql.Model.*;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser,Long>  {
	Optional<MyUser> findByUsername(String username);

}
