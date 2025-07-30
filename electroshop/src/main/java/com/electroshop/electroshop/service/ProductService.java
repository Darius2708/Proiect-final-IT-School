package com.electroshop.electroshop.service;

import com.electroshop.electroshop.model.Produs;

import java.util.List;

public interface ProductService {
    List<Produs> getAllProducts();
    Produs addProduct(Produs produs);
    Produs updateProduct(Long id, Produs produs);
    void deleteProduct(Long id);
    Produs getProductById(Long id);
    List<Produs> searchByBrand(String brand);
    List<Produs> getByCategorieId(Long categorieId);
    List<Produs> getProduseByCategorie(Long categorieId);


}
