package com.example.demo.services.impl;


import com.example.demo.model.Canasta;
import com.example.demo.model.Producto;
import com.example.demo.model.ProductoCanasta;
import com.example.demo.repository.ProductoCanastaRepository;
import com.example.demo.services.IProductoCanastaService;
import com.example.demo.services.IProductoService;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoCanastaServiceImpl implements IProductoCanastaService {

    private ProductoCanastaRepository productoCanastaRepository;
    private IProductoService productoService;

    public ProductoCanastaServiceImpl(
            ProductoCanastaRepository productoCanastaRepository,IProductoService productoService) {
        this.productoCanastaRepository = productoCanastaRepository;
        this.productoService= productoService;
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
    public List<Producto> consultarProductosDeCanasta(Long id) {
        List<Producto> productos =new ArrayList<>();
        System.out.println(id);
            for (ProductoCanasta productoCanasta : productoCanastaRepository.findAll()) {
                  productos.add(productoService.consultar(productoCanasta.getIdProducto()));

            }

        return productos;
    }

}
