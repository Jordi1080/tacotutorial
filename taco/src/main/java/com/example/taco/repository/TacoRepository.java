package com.example.taco.repository;

import com.example.taco.Ingredient;
import com.example.taco.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    // CrudRepository<Taco, Long> --> String omdat ID als Long staat in Taco
}
