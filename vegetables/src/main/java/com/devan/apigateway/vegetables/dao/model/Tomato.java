package com.devan.apigateway.vegetables.dao.model;

import com.devan.apigateway.vegetables.dao.enums.TomatoType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tomato extends Vegetable {

    private TomatoType type;
}
