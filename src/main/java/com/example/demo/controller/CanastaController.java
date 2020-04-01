package com.example.demo.controller;


import com.example.demo.model.Canasta;
import com.example.demo.services.ICanastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CanastaController {
    @Autowired
    private  ICanastaService canastaService;

    @PostMapping("/tienda/agregarCanasta")
    public Canasta add(@RequestBody Canasta canasta){
        return canastaService.crear(canasta);
    }

    @GetMapping("/tienda/consultarCanasta")
    public Canasta consultar(@PathVariable("id") long id ){ return canastaService.consultar(id);}

    @DeleteMapping("/tienda/canasta/{id}")
    public boolean eliminar (@PathVariable Long id){
        return canastaService.eliminar(id);
    }
    @GetMapping("/tienda/ConsultarTodosCanasta")
    public List<Canasta> consultarTodos(){ return canastaService.consultarTodos();}

}
