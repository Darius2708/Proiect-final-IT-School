package com.electroshop.electroshop.service.impl;

import com.electroshop.electroshop.model.Produs;
import com.electroshop.electroshop.repository.ProdusRepository;
import com.electroshop.electroshop.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProdusRepository produsRepository;

    public ProductServiceImpl(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }

    @Override
    public List<Produs> getAllProducts() {
        return produsRepository.findAll();
    }

    @Override
    public Produs addProduct(Produs produs) {
        return produsRepository.save(produs);
    }

    @Override
    public Produs updateProduct(Long id, Produs produsNou) {
        Optional<Produs> optionalProdus = produsRepository.findById(id);
        if (optionalProdus.isPresent()) {
            Produs produsExistent = optionalProdus.get();
            produsExistent.setNume(produsNou.getNume());
            produsExistent.setDescriere(produsNou.getDescriere());
            produsExistent.setPret(produsNou.getPret());
            produsExistent.setStoc(produsNou.getStoc());
            produsExistent.setBrand(produsNou.getBrand());
            produsExistent.setImagineUrl(produsNou.getImagineUrl());
            return produsRepository.save(produsExistent);
        } else {
            throw new RuntimeException("Produsul cu ID-ul " + id + " nu a fost găsit");
        }
    }

    @Override
    public void deleteProduct(Long id) {
        produsRepository.deleteById(id);
    }

    @Override
    public Produs getProductById(Long id) {
        return produsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produsul cu ID-ul " + id + " nu a fost găsit"));
    }
    @Override
    public List<Produs> searchByBrand(String brand) {
        return produsRepository.findByBrandContainingIgnoreCase(brand);
    }
    @Override
    public List<Produs> getByCategorieId(Long categorieId) {
        return produsRepository.findByCategorieId(categorieId);
    }
    @Override
    public List<Produs> getProduseByCategorie(Long categorieId) {
        return produsRepository.findByCategorieId(categorieId);
    }


}
