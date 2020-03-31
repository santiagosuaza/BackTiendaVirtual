package com.example.demo.services;

import com.example.demo.model.Categoria;

import java.util.List;

public interface ICategoriaService {
    Categoria crear(Categoria categoria);
    Categoria consultar(Long id);
    boolean eliminar(Long id);
    List<Categoria> consultarTodos();
}
