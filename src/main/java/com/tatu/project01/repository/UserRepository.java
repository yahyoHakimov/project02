package com.tatu.project01.repository;

import com.tatu.project01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
   Optional<User> findByPhoneNumber(String phoneNumber);
}
