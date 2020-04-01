package com.example.demo.services.impl;



import com.example.demo.model.Canasta;
import com.example.demo.repository.CanastaRepository;
import com.example.demo.services.ICanastaService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CanastaServiceImpl implements ICanastaService {

    private CanastaRepository canastaRepository;

    public CanastaServiceImpl(
            CanastaRepository canastaRepository){
      this.canastaRepository = canastaRepository;
    }

    @Override
    public Canasta crear(Canasta canasta){
        canastaRepository.save(canasta);
        return canasta;
    }

    @Override
    public  Canasta consultar(Long id){
        return canastaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid User Id" + id));
    }

    @Override
    public  boolean eliminar(Long id){
        return  canastaRepository.findById(id).map(
                canasta -> {
                   canastaRepository.delete(canasta);
                    return true;
                }
        ).orElse(false);
    }

    @Override
    public List<Canasta> consultarTodos(){return  canastaRepository.findAll();}


}
