package com.example.demo;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Entity
//create table sql
public class Car {
    @Id
    //auto incriment our id numbers
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //none of these can be null
    @NotNull
    @Size(min = 3)
    private String carName;

    @NotNull
    @Size(min = 3)
    private String manufacturer;

    @NotNull
    @Size(min = 3)
    private String style;

    @NotNull
    @Size(min = 2)
    private String year;

    @NotNull
    @Size(min = 2)
    private String mSRP;

    //prive string categoryName
    private String carpic;

    //there are many different types of cars to one Category
    //Fetch type Eagar means
    @ManyToOne(fetch = FetchType.EAGER)
    //join the column on the CateGory ID which is Unique

    @JoinColumn(name = "category_id")
    private Categories  categories;



    public Car() {


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

    public String getCarpic() {
        return carpic;
    }

    public void setCarpic(String carpic) {
        this.carpic = carpic;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}