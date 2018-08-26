package com.devan.apigateway.vegetables.dao.repository;

import com.devan.apigateway.vegetables.dao.model.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository<T extends Vegetable> extends JpaRepository<T, Long> {
}
