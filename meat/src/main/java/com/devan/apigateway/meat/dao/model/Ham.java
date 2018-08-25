package com.devan.apigateway.meat.dao.model;

import javax.persistence.Entity;

@Entity(name = "HAM")
public class Ham extends BaseMeat {

    public Ham(Long sandwichNo) {
        super(sandwichNo);
    }
}
