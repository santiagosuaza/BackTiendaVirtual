package com.example.demo.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
@IdClass(ProductoCanastaKey.class)
public class ProductoCanasta {


    Long idProducto;

    @Id
    Long idCanasta;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "canasta_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Canasta canasta;

    @ManyToOne
    @JsonIgnore
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
