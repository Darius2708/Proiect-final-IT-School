package com.electroshop.electroshop.service.impl;

import com.electroshop.electroshop.model.Produs;
import com.electroshop.electroshop.repository.ProdusRepository;
import com.electroshop.electroshop.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
