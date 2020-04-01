package com.example.demo.services;

import com.example.demo.model.Canasta;

import java.util.List;

public interface ICanastaService {
    Canasta crear(Canasta canasta);
    Canasta consultar(Long id);
    List<Canasta> consultarTodos();
    boolean eliminar(Long id);
}
