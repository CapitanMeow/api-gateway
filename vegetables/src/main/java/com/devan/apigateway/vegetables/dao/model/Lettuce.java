package com.devan.apigateway.vegetables.dao.model;

import com.devan.apigateway.vegetables.dao.enums.LettuceType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "LETTUCE")
public class Lettuce extends Vegetable {

    @Enumerated(EnumType.STRING)
    private LettuceType type;
}
