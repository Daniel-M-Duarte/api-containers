package com.example.demo.repositories;

import com.example.demo.entities.Containers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainersRepository extends JpaRepository<Containers,Long> {
}
