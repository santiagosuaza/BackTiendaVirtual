package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

import java.util.Objects;

@Entity
@Data
@IdClass(ProductoCanastaKey.class)
public class ProductoCanasta {

    @Id
    Long idProducto;

    @Id
    Long idCanasta;

    @ManyToOne
    @JoinColumn(name = "canasta_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Canasta canasta;

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Producto producto;

    private Integer cantidad;

    public ProductoCanasta() {
    }

    public ProductoCanasta(Long idProducto, Long idCanasta, Integer cantidad) {
        this.idProducto = idProducto;
        this.idCanasta = idCanasta;
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoCanasta that = (ProductoCanasta) o;
        return Objects.equals(idProducto, that.idProducto) &&
                Objects.equals(idCanasta, that.idCanasta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, idCanasta);
    }
}
