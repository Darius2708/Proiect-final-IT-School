package com.electroshop.electroshop.model;

import jakarta.persistence.*;

public class Produs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;
    private String descriere;
    private double pret;
    private int stoc;
    private String brand;
    private String imagineUrl;

    // Gettere și settere
}
