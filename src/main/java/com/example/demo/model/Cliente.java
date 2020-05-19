package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String usuario;
    private String contrasenha;
    private String correo;
    private Integer zip;
    private String ciudad;
    private String direccion;
    private Integer telefono;

    public Cliente() {
    }

    public Cliente(String usuario, String contrasenha, String correo, Integer zip, String ciudad, String direccion, Integer telefono) {
        this.usuario = usuario;
        this.contrasenha = contrasenha;
        this.correo = correo;
        this.zip = zip;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario) &&
                Objects.equals(contrasenha, cliente.contrasenha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contrasenha);
    }
}
