package com.example.demo.services.impl;


import com.example.demo.model.Categoria;

import com.example.demo.repository.CategoriaRepository;
import com.example.demo.services.ICategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria crear(Categoria categoria) {
        categoriaRepository.save(categoria);
        return categoria;
    }

    @Override
    public Categoria consultar(Long id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid User Id" + id));
    }

    @Override
    public boolean eliminar(Long id) {
        return categoriaRepository.findById(id).map(
                categoria -> {
                    categoriaRepository.delete(categoria);
                    return true;
                }
        ).orElse(false);
    }


    @Override
    public List<Categoria> consultarTodos() {
        return categoriaRepository.findAll();
    }


}
