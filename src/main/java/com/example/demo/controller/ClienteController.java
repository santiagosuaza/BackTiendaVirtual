package com.example.demo.controller;



import com.example.demo.model.Cliente;
import com.example.demo.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @PostMapping("/tienda/agregarCliente")
    public Cliente add(@RequestBody Cliente cliente){
        return clienteService.crear(cliente);
    }

    @GetMapping("/tienda/consultarCliente")
    public Cliente consultar(@PathVariable("id") long id ){ return clienteService.consultar(id);}

    @DeleteMapping("/tienda/producto/{id}")
        public boolean eliminar (@PathVariable Long id){
        return clienteService.eliminar(id);
    }
    @GetMapping("/tienda/ConsultarTodosCliente")
     public List<Cliente> consultarTodos(){ return clienteService.consultarTodos();}

}
