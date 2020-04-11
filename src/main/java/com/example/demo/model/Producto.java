package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "categoria")
    private Long idCategoria;

    private String nombre;
    private Integer cantidad;
    private String detalle;
    private Double precio;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "producto")
    private List<ProductoCanasta> productoCanastas = new ArrayList<>();

    public Producto(Long idCategoria, String nombre, Integer cantidad, String detalle, Double precio) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
