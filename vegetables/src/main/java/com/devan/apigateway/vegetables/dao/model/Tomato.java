package com.devan.apigateway.vegetables.dao.model;

import com.devan.apigateway.vegetables.dao.enums.TomatoType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "TOMATO")
public class Tomato extends Vegetable {

    @Enumerated(EnumType.STRING)
    private TomatoType type;
}
