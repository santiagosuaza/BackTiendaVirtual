package com.example.demo.repository;

import com.example.demo.model.ProductoCanasta;
import netscape.javascript.JSObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ProductoCanastaRepository extends JpaRepository<ProductoCanasta, Long> {
    //List<ProductoCanasta> findAllByIdCanasta(Long


}
