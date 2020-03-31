package com.example.demo.services.impl;




import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.services.IProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    private ProductoRepository productoRepository;
    public ProductoServiceImpl(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto crear(Producto producto){
        productoRepository.save(producto);
        return producto;
    }

    @Override
    public  Producto consultar(Long id){
        return productoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid User Id" + id));
    }

    @Override
    public  boolean eliminar(Long id){
        return  productoRepository.findById(id).map(
                producto -> {
                    productoRepository.delete(producto);
                    return true;
                }
        ).orElse(false);
    }

    @Override
    public List<Producto> consultarTodos(){return  productoRepository.findAll();}






}

