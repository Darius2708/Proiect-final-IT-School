package com.electroshop.electroshop.controller;

import com.electroshop.electroshop.model.Comanda;
import com.electroshop.electroshop.repository.ComandaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comenzi")
@CrossOrigin(origins = "*")
public class ComandaController {

    private final ComandaRepository comandaRepository;

    public ComandaController(ComandaRepository comandaRepository) {
        this.comandaRepository = comandaRepository;
    }

    @PostMapping
    public Comanda plasareComanda(@RequestBody Comanda comanda) {
        return comandaRepository.save(comanda);
    }

    @GetMapping
    public List<Comanda> getComenzi() {
        return comandaRepository.findAll();
    }
}
