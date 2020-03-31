package com.example.demo.services;



import com.example.demo.model.ProductoCanasta;

import java.util.List;

public interface IProductoCanastaService {
    ProductoCanasta crear(ProductoCanasta productoCanasta);
    ProductoCanasta consultar(Long id);
    List<ProductoCanasta> consultarTodos();
    boolean eliminar(Long id);
}
