package com.example.demo.controller;



import com.example.demo.model.Producto;
import com.example.demo.model.ProductoCanasta;
import com.example.demo.services.IProductoCanastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductoCanastaController {

    @Autowired
    private IProductoCanastaService productoCanastaService;

    @PostMapping("/tienda/productoCanasta")
    public ProductoCanasta crear(@RequestBody ProductoCanasta productoCanasta) {
        return productoCanastaService.crear(productoCanasta);
    }
    @GetMapping("/tienda/productoCanasta/{id}")
    public ProductoCanasta consultar(@PathVariable("id") long id) {
        return productoCanastaService.consultar(id);
    }

    @DeleteMapping("/tienda/productoCanasta/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return productoCanastaService.eliminar(id);
    }

    @GetMapping("/tienda/Productoscanastas")
    public List<ProductoCanasta> consultarTodos() {
        return productoCanastaService.consultarTodos();
    }

    @GetMapping("/tienda/consultarProductosCanasta/{id}")
    public List<Producto> consultarProductosCannasta(@PathVariable("id") Long id){return productoCanastaService.consultarProductosDeCanasta(id);}


}
