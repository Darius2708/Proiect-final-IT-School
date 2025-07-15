package com.electroshop.electroshop.controller;

import com.electroshop.electroshop.model.Produs;
import com.electroshop.electroshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produse")
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Produs> getAllProducts() {
        return productService.getAllProducts();
    }
}
