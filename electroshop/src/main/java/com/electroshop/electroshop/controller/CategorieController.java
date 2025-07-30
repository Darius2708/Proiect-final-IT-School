package com.electroshop.electroshop.controller;

import com.electroshop.electroshop.model.Categorie;
import com.electroshop.electroshop.repository.CategorieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorii")
@CrossOrigin(origins = "*")
public class CategorieController {

    private final CategorieRepository categorieRepository;

    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @GetMapping
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }
}
