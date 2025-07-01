package com.example.pictgram2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pictgram2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}