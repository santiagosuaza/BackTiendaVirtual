package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class ProductoCanastaKey implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "producto_id")
    Long idProducto;

    @Column(name = "canasta_id")
    Long idCanasta;
}
