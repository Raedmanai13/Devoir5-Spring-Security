package com.raed.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raed.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}