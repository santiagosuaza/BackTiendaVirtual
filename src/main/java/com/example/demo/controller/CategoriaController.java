package com.example.demo.controller;


import com.example.demo.model.Categoria;
import com.example.demo.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class CategoriaController {
    @Autowired
    ICategoriaService categoriaService;

    @PostMapping("/tienda/agregarCanasta")
    public Categoria add(@RequestBody Categoria categoria){
        return categoriaService.crear(categoria);
    }

    @GetMapping("/tienda/consultarCanasta")
    public Categoria consultar(@PathVariable("id") long id ){ return categoriaService.consultar(id);}

    @DeleteMapping("/tienda/canasta/{id}")
    public boolean eliminar (@PathVariable Long id){
        return categoriaService.eliminar(id);
    }
    @GetMapping("/tienda/ConsultarTodosCanasta")
    public List<Categoria> consultarTodos(){ return categoriaService.consultarTodos();}


}