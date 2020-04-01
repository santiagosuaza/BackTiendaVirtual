package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "ProductoCanasta")
public class ProductoCanasta {
    @Id
    @Column(name = "Producto")
    private Long idProducto;
    @Column(name = "Canasta")
    private Long idCanasta;
    private  Integer cantidad;

    public ProductoCanasta() {
    }

    public ProductoCanasta(Long idProducto, Long idCanasta, Integer cantidad) {
        this.idProducto = idProducto;
        this.idCanasta = idCanasta;
        this.cantidad = cantidad;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdCanasta() {
        return idCanasta;
    }

    public void setIdCanasta(Long idCanasta) {
        this.idCanasta = idCanasta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
