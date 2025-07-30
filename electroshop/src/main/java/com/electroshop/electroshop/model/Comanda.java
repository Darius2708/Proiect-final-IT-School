package com.electroshop.electroshop.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Comanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;
    private String adresa;
    private String telefon;
    private String email;
    private String metodaPlata;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produs> produse;

    // Getteri și setteri
}
