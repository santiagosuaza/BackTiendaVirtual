package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
import lombok.Data;
@Entity
@Data
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idCliente;
    private String Usuario;
    private String contraseña;
    private String correo;
    private Integer zip;
    private String ciudad;
    private String direccion;
    private Integer  telefono;

    public Cliente() {
    }

    public Cliente(String usuario, String contraseña, String correo, Integer zip, String ciudad, String direccion, Integer telefono) {
        Usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.zip = zip;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(Usuario, cliente.Usuario) &&
                Objects.equals(contraseña, cliente.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Usuario, contraseña);
    }
}
