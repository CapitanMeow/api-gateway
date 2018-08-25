package com.devan.apigateway.meat.dao.model;

import javax.persistence.Entity;

@Entity(name = "BACON")
public class Bacon extends BaseMeat{

    public Bacon(Long sandwichNo) {
        super(sandwichNo);
    }
}
