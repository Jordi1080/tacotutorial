package com.example.taco.repository;

import com.example.taco.Order;
import com.example.taco.Taco;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
    // CrudRepository<Taco, Long> --> String omdat ID als Long staat in Taco
}
