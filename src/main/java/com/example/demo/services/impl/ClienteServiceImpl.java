package com.example.demo.services.impl;

import com.example.demo.model.Cliente;
import com.example.demo.model.Producto;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.services.IClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    private ClienteRepository clienteRepository;
    public ClienteServiceImpl(ClienteRepository clienteRepository){
      this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente crear(Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }

    @Override
    public  Cliente consultar(Long id){
        return clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid User Id" + id));
    }

    @Override
    public  boolean eliminar(Long id){
        return  clienteRepository.findById(id).map(
                cliente -> {
                    clienteRepository.delete(cliente);
                    return true;
                }
        ).orElse(false);
    }
    @Override
    public List<Cliente> consultarTodos(){return  clienteRepository.findAll();}



}


