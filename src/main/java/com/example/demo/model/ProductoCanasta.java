package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class ProductoCanasta {
    @Id
    @Column(name = "Producto")
    private String idProducto;
    @Column(name = "Canasta")
    private String idCanasta;
    private  Integer cantidad;

    public ProductoCanasta() {
    }

    public ProductoCanasta(String idProducto, String idCanasta, Integer cantidad) {
        this.idProducto = idProducto;
        this.idCanasta = idCanasta;
        this.cantidad = cantidad;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdCanasta() {
        return idCanasta;
    }

    public void setIdCanasta(String idCanasta) {
        this.idCanasta = idCanasta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
