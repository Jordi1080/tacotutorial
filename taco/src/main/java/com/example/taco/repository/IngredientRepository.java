package com.example.taco.repository;

import com.example.taco.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    // CrudRepository<Ingredient, String> --> String omdat ID als String staat in Ingredient
}
