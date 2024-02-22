package com.management.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Plat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlat;
    private String imagePlat;
    private String namePlat;
    private Double pricePlat;
    private int preparationPlat;
    private int livraisonPlat;
    @ManyToOne
    private Category categoryPlat;
    @ManyToOne
    private Disponibility disponibilityPlat;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Ingredient> ingredientPlat;

    public void setCategoryPlat(Category categoryPlat) {
        this.categoryPlat = categoryPlat;
    }

    @Override
    public String toString() {
        return "Plat{" +
                "idProduct=" + idPlat +
                ", namePlat='" + namePlat + '\'' +
                ", pricePlat=" + pricePlat +
                '}';
    }

    public Plat(Long idPlat, String imagePlat, String namePlat, Double pricePlat, int preparationPlat, int livraisonPlat, Category categoryPlat, Disponibility disponibilityPlat, List<Ingredient> ingredientPlat) {
        this.idPlat = idPlat;
        this.imagePlat = imagePlat;
        this.namePlat = namePlat;
        this.pricePlat = pricePlat;
        this.preparationPlat = preparationPlat;
        this.livraisonPlat = livraisonPlat;
        this.categoryPlat = categoryPlat;
        this.disponibilityPlat = disponibilityPlat;
        this.ingredientPlat = ingredientPlat;
    }

    public Plat() {
        super();
    }

    public Long getIdPlat() {
        return idPlat;
    }

    public void setIdPlat(Long idPlat) {
        this.idPlat = idPlat;
    }

    public String getImagePlat() {
        return imagePlat;
    }

    public void setImagePlat(String imagePlat) {
        this.imagePlat = imagePlat;
    }

    public String getNamePlat() {
        return namePlat;
    }

    public void setNamePlat(String namePlat) {
        this.namePlat = namePlat;
    }

    public Double getPricePlat() {
        return pricePlat;
    }

    public void setPricePlat(Double pricePlat) {
        this.pricePlat = pricePlat;
    }

    public int getPreparationPlat() {
        return preparationPlat;
    }

    public void setPreparationPlat(int preparationPlat) {
        this.preparationPlat = preparationPlat;
    }

    public int getLivraisonPlat() {
        return livraisonPlat;
    }

    public void setLivraisonPlat(int livraisonPlat) {
        this.livraisonPlat = livraisonPlat;
    }

    public Category getCategoryPlat() {
        return categoryPlat;
    }

    public Disponibility getDisponibilityPlat() {
        return disponibilityPlat;
    }

    public void setDisponibilityPlat(Disponibility disponibilityPlat) {
        this.disponibilityPlat = disponibilityPlat;
    }

    public List<Ingredient> getIngredientPlat() {
        return ingredientPlat;
    }

    public void setIngredientPlat(List<Ingredient> ingredientPlat) {
        this.ingredientPlat = ingredientPlat;
    }
}
