package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Objects;

public class Producto {
    @Id
    @Column(name = "Producto")
    private String IdProducto;
    @Column(name = "Categoria")
    private String idCategoria;
    private String nombre;
    private Integer cantidad;
    private String detalle;
    private Double precio;

    public Producto(String idProducto, String idCategoria, String nombre, Integer cantidad, String detalle, Double precio) {
        IdProducto = idProducto;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String idProducto) {
        IdProducto = idProducto;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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
