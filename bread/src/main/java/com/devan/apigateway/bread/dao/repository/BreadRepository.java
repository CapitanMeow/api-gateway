package com.devan.apigateway.bread.dao.repository;

import com.devan.apigateway.bread.dao.model.Bread;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreadRepository extends JpaRepository<Bread, Long> {

}
