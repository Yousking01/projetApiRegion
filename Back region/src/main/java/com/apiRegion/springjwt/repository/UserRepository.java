package com.apiRegion.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apiRegion.springjwt.models.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

	//User findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	//User findByUsername(String username);

	@Query(value = "SELECT * FROM `users` WHERE username=:username",nativeQuery = true)
	User findByNomUser(@Param("username") String username);
}
