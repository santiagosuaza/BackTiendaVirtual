package com.example.demo.controller;


import com.example.demo.model.Categoria;
import com.example.demo.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaController {
    @Autowired
    private ICategoriaService categoriaService;

    @PostMapping("/tienda/categoria")
    public Categoria crear(@RequestBody Categoria categoria) {
        return categoriaService.crear(categoria);
    }

    @GetMapping("/tienda/categoria/{id}")
    public Categoria consultar(@PathVariable("id") long id) {
        return categoriaService.consultar(id);
    }

    @DeleteMapping("/tienda/categoria/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return categoriaService.eliminar(id);
    }

    @GetMapping("/tienda/categorias")
    public List<Categoria> consultarTodos() {
        return categoriaService.consultarTodos();
    }


}
