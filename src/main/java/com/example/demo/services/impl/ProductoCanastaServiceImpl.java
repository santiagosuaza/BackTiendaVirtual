package com.example.demo.services.impl;


import com.example.demo.model.ProductoCanasta;
import com.example.demo.repository.ProductoCanastaRepository;
import com.example.demo.services.IProductoCanastaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoCanastaServiceImpl implements IProductoCanastaService {

    private ProductoCanastaRepository productoCanastaRepository;

    public ProductoCanastaServiceImpl(
            ProductoCanastaRepository productoCanastaRepository) {
        this.productoCanastaRepository = productoCanastaRepository;
    }

    @Override
    public ProductoCanasta crear(ProductoCanasta productoCanasta) {
        productoCanastaRepository.save(productoCanasta);
        return productoCanasta;
    }

    @Override
    public ProductoCanasta consultar(Long id) {
        return productoCanastaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid User Id" + id));
    }

    @Override
    public boolean eliminar(Long id) {
        return productoCanastaRepository.findById(id).map(
                productoCanasta -> {
                    productoCanastaRepository.delete(productoCanasta);
                    return true;
                }
        ).orElse(false);
    }

    @Override
    public List<ProductoCanasta> consultarTodos() {
        return productoCanastaRepository.findAll();
    }
    @Override
    public List<ProductoCanasta> consultarPorProducto(Long id) {
        return  productoCanastaRepository.findByIdProducto(id);
    }

}
