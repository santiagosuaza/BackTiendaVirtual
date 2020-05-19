package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    private String tipo;

    public Categoria() {
    }

    public Categoria(String nombre) {
        this.tipo = nombre;
    }
}
