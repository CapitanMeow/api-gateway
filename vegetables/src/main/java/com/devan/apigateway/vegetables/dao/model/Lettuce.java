package com.devan.apigateway.vegetables.dao.model;

import com.devan.apigateway.vegetables.dao.enums.LettuceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lettuce extends Vegetable {

    private LettuceType type;
}
