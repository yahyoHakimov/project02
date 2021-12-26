package com.tatu.project01.repository;

import com.tatu.project01.entity.Student;
import com.tatu.project01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
