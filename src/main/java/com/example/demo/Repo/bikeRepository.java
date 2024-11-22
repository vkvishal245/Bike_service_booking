package com.example.demo.Repo;

import com.example.demo.Entitty.bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bikeRepository extends JpaRepository<bike,Integer> {
}
