package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String numeroCanasta;


    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "canasta")
    private List<ProductoCanasta> productoCanastas = new ArrayList<>();

    public Canasta(Long idCliente, Date fecha, String direccion, String ciudad, String numeroCanasta) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.numeroCanasta= numeroCanasta;
    }
    public Canasta() {
    }



}
