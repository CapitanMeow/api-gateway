package com.devan.apigateway.meat.dao.repository;

import com.devan.apigateway.meat.dao.model.BaseMeat;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface BaseMeatRepository<T extends BaseMeat> extends JpaRepository<T, Long>{
}
