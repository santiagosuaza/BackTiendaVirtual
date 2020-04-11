package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@Table(name = "canasta")
public class Canasta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente")
    private Long idCliente;
    private Date fecha;
    private String direccion;
    private String ciudad;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "canasta")
    private List<ProductoCanasta> productoCanastas = new ArrayList<>();

    public Canasta(Long idCliente, Date fecha, String direccion, String ciudad) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Canasta canasta = (Canasta) o;
        return Objects.equals(id, canasta.id) &&
                Objects.equals(idCliente, canasta.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCliente);
    }
}
