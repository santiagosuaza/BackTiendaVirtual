package com.example.demo.repository;

import com.example.demo.model.Canasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanastaRepository extends JpaRepository<Canasta, Long> {
}