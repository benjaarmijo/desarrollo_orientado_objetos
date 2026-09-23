package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Bebida;
import com.example.demo.repository.BebidaRepository;
import org.springframework.stereotype.Service;

@Service
public class BebidaService {

    private final BebidaRepository bebidaRepository;

    public BebidaService(BebidaRepository bebidaRepository) {
        this.bebidaRepository = bebidaRepository;
    }

    public Bebida guardar(Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    public List<Bebida> listar() {
        return bebidaRepository.findAll();
    }

}
