package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3)
    private String carName;

    @NotNull
    @Size(min=3)
    private String manufacturer;

    @NotNull
    @Size(min=3)
    private String style;

    @NotNull
    @Size(min=2)
    private String year;

    @NotNull
    @Size(min=2)
    private String mSRP;

    @OneToMany(mappedBy = "car")
    private Set<CategoriesCar> categoriesCar;

    public Car() {
        categoriesCar = new HashSet<>();

    }

//    public Car(@NotNull @Size(min = 3) String carName, @NotNull @Size(min = 3) String manufacturer, @NotNull @Size(min = 3) String style, @NotNull @Size(min = 2) String year, @NotNull @Size(min = 2) String mSRP, Set<CategoriesCar> categoriesCar) {
//        this.carName = carName;
//        this.manufacturer = manufacturer;
//        this.style = style;
//        this.year = year;
//        this.mSRP = mSRP;
//        this.categoriesCar = categoriesCar;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getmSRP() {
        return mSRP;
    }

    public void setmSRP(String mSRP) {
        this.mSRP = mSRP;
    }

    public Set<CategoriesCar> getCategoriesCar() {
        return categoriesCar;
    }

    public void setCategoriesCar(Set<CategoriesCar> categoriesCar) {
        this.categoriesCar = categoriesCar;
    }
}