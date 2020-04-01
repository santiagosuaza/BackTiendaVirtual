package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Canasta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idCanasta;
    @Column(name = "Cliente")
    private Long idCliente;
    private Date fecha;
    private String direccion;
    private String Medellin;
    private Integer Zip;


    public Canasta() {
    }

    public Canasta(Long idCliente, Date fecha, String direccion, String medellin, Integer zip) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.direccion = direccion;
        Medellin = medellin;
        Zip = zip;
    }

    public Long getIdCanasta() {
        return idCanasta;
    }

    public void setIdCanasta(Long idCanasta) {
        this.idCanasta = idCanasta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMedellin() {
        return Medellin;
    }

    public void setMedellin(String medellin) {
        Medellin = medellin;
    }

    public Integer getZip() {
        return Zip;
    }

    public void setZip(Integer zip) {
        Zip = zip;
    }
}
