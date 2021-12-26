package com.tatu.project01.repository;

import com.tatu.project01.entity.Role;
import com.tatu.project01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
