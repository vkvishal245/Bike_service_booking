package com.example.demo.Repo;
import com.example.demo.Entitty.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userRepository extends JpaRepository<Users, Integer> {
}
