package com.example.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String categoriesName;


    @OneToMany(mappedBy = "catego")
    private Set<CategoriesCar> categoriesCars;

    public Categories(){
        categoriesCars =  new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }

    public Set<CategoriesCar> getCategoriesCars() {
        return categoriesCars;
    }

    public void setCategoriesCars(Set<CategoriesCar> categoriesCars) {
        this.categoriesCars = categoriesCars;
    }
}
