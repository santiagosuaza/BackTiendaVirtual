package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.services.impl.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CommandLineStartupRunner implements CommandLineRunner {

 private final ClienteServiceImpl clienteService;
 private final CategoriaServiceImpl categoriaService;
 private final ProductoServiceImpl productoService;
 private final CanastaServiceImpl canastaService;
 private final ProductoCanastaServiceImpl detalleCanastaService;

    public CommandLineStartupRunner(ClienteServiceImpl clienteService, CategoriaServiceImpl categoriaService, ProductoServiceImpl productoService, CanastaServiceImpl canastaService, ProductoCanastaServiceImpl detalleCanastaService) {
        this.clienteService = clienteService;
        this.categoriaService = categoriaService;
        this.productoService = productoService;
        this.canastaService = canastaService;
        this.detalleCanastaService = detalleCanastaService;
    }

    @Override
    public void run(String... args) throws Exception {
        //CLIENTES

        Cliente cliente = clienteService.crear(new Cliente("juanda", "123", "000", 0, "Med", "cr 28", 123));

        //CATEGORIAS
        Categoria categoria = categoriaService.crear(new Categoria("Prueba"));

        //PRODUCTOS
        Producto producto = productoService.crear(new Producto(categoria.getIdCategoria(), "Taladro", 3, "Melo", 50000.0));

        //CANASTA
        Canasta canasta = canastaService.crear(new Canasta(cliente.getIdCliente(), new Date(), "cr 27sa", "asd"));

        //DETALLE CANASTA
        detalleCanastaService.crear(new ProductoCanasta(producto.getId(),canasta.getId(),1));
    }
}
