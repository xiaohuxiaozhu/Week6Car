package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CategoriesCarRepository extends CrudRepository<CategoriesCar, Long> {
        Iterable<CategoriesCar> findAllByCatego_Id(Long catego_id);
}
