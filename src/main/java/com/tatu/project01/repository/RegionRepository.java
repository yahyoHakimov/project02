package com.tatu.project01.repository;

import com.tatu.project01.entity.Region;
import com.tatu.project01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Integer> {
}
