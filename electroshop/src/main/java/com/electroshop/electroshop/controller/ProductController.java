package com.electroshop.electroshop.controller;

import com.electroshop.electroshop.model.Produs;
import com.electroshop.electroshop.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/search")
    public List<Produs> searchProductsByBrand(@RequestParam String brand) {
        return productService.searchByBrand(brand);
    }

    @PostMapping
    public ResponseEntity<Produs> addProduct(@RequestBody Produs produs) {
        Produs nou = productService.addProduct(produs);
        return ResponseEntity.status(HttpStatus.CREATED).body(nou);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produs> updateProduct(@PathVariable Long id, @RequestBody Produs produs) {
        Produs actualizat = productService.updateProduct(id, produs);
        return ResponseEntity.ok(actualizat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produs> getProductById(@PathVariable Long id) {
        Produs produs = productService.getProductById(id);
        return ResponseEntity.ok(produs);
    }

    @GetMapping("/categorie/{categorieId}")
    public List<Produs> getProduseByCategorie(@PathVariable Long categorieId) {
        return productService.getProduseByCategorie(categorieId);
    }


} 