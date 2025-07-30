package com.electroshop.electroshop.service.impl;

import com.electroshop.electroshop.model.Produs;
import com.electroshop.electroshop.repository.ProdusRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ProductServiceImplTest {

    @Mock
    private ProdusRepository produsRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllProducts() {
        Produs produs = new Produs();
        produs.setNume("Cablu electric");

        when(produsRepository.findAll()).thenReturn(List.of(produs));

        List<Produs> produse = productService.getAllProducts();

        assertEquals(1, produse.size());
        assertEquals("Cablu electric", produse.get(0).getNume());
    }
}
