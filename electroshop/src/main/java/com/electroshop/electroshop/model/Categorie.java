package com.electroshop.electroshop.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;

    @OneToMany(mappedBy = "categorie")
    private List<Produs> produse;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public List<Produs> getProduse() { return produse; }
    public void setProduse(List<Produs> produse) { this.produse = produse; }
}
