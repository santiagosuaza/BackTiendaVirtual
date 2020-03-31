package com.example.demo.services;


import com.example.demo.model.Cliente;

import java.util.List;

public interface IClienteService {
    Cliente crear(Cliente cliente);
    Cliente consultar(Long id);
    List<Cliente> consultarTodos();
    boolean eliminar(Long id);
}
