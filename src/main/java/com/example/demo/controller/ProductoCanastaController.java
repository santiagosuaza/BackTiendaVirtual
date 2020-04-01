package com.example.demo.controller;


import com.example.demo.model.ProductoCanasta;
import com.example.demo.services.IProductoCanastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ProductoCanastaController {
    @Autowired
    private  IProductoCanastaService productoCanastaService;

    @PostMapping("/tienda/agregarProductoCanasta")
    public ProductoCanasta crear(@RequestBody ProductoCanasta productoCanasta){
        return productoCanastaService.crear(productoCanasta);
    }

    @GetMapping("/tienda/consultarProductoCanasta")
    public ProductoCanasta consultar(@PathVariable("id") long id ){ return productoCanastaService.consultar(id);}

    @DeleteMapping("/tienda/productoCanasta/{id}")
    public boolean eliminar (@PathVariable Long id){
        return productoCanastaService.eliminar(id);
    }
    @GetMapping("/tienda/ConsultarTodosProductoCanasta")
    public List<ProductoCanasta> consultarTodos(){ return productoCanastaService.consultarTodos();}

}
