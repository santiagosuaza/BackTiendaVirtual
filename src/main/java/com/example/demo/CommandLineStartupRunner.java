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

    }
}
