package com.example.demo;


import javax.persistence.*;

@Entity
public class CategoriesCar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Categories catego;

    @ManyToOne
    private Car car;

    public CategoriesCar(){
        catego = new Categories();
        car = new Car();
    }

    public CategoriesCar(Categories catego, Car car) {
        this.catego = catego;
        this.car = car;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Categories getCatego() {
        return catego;
    }

    public void setCatego(Categories catego) {
        this.catego = catego;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
