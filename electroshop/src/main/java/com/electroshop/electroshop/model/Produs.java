package com.electroshop.electroshop.model;

import jakarta.persistence.*;

@Entity
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

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public String getDescriere() { return descriere; }
    public void setDescriere(String descriere) { this.descriere = descriere; }

    public double getPret() { return pret; }
    public void setPret(double pret) { this.pret = pret; }

    public int getStoc() { return stoc; }
    public void setStoc(int stoc) { this.stoc = stoc; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getImagineUrl() { return imagineUrl; }
    public void setImagineUrl(String imagineUrl) { this.imagineUrl = imagineUrl; }

    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}
