package com.example.demo.controller;

import com.example.demo.model.Bebida;
import com.example.demo.service.BebidaService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaController {

    private final BebidaService bebidaService;

    public BebidaController(BebidaService bebidaService) {
        this.bebidaService = bebidaService;
    }
    @GetMapping
    public List<Bebida> listar() {
        return bebidaService.listar();
    }
    @PostMapping
    public Bebida guardar(@RequestBody Bebida bebida) {
        return bebidaService.guardar(bebida);
    }

}
