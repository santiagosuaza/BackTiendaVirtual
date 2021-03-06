package com.example.demo.controller;


import com.example.demo.model.Producto;
import com.example.demo.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @PostMapping("/tienda/producto")
    public Producto crear(@RequestBody Producto producto) {
        return productoService.crear(producto);
    }

    @GetMapping("/tienda/producto/{id}")
    public Producto consultar(@PathVariable("id") long id) {
        return productoService.consultar(id);
    }

    @DeleteMapping("/tienda/producto/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return productoService.eliminar(id);
    }

    @GetMapping("/tienda/Productos")
    public List<Producto> consultarTodos() { return productoService.consultarTodos();}

    @GetMapping("/tienda/productoCategoria/{id}")
    public  List<Producto> consultarPorCategorias(@PathVariable("id")Long id){return productoService.consultarPorCategorias(id);}

    @GetMapping("/tienda/productoBuscar/{id}")
    public  List<Producto> consultarPorCategorias(@PathVariable("id")String id){return productoService.buscarProducto(id);}
}

