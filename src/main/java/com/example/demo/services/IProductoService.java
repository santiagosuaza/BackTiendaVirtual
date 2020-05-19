package com.example.demo.services;


import com.example.demo.model.Producto;

import java.util.List;

public interface IProductoService {
    Producto crear(Producto producto);
    Producto consultar(Long id);
    boolean eliminar(Long id);
    List<Producto> consultarTodos();
    List<Producto>consultarPorCategorias(Long id);
    List<Producto> buscarProducto(String id);
}

