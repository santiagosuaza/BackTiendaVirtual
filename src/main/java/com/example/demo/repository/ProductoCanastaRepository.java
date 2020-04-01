package com.example.demo.repository;

import com.example.demo.model.ProductoCanasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoCanastaRepository extends JpaRepository<ProductoCanasta, Long> {
}
