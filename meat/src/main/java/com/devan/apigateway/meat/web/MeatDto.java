package com.devan.apigateway.meat.web;

import com.devan.apigateway.meat.dao.model.BaseMeat;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MeatDto implements Serializable {

    private String type;

    private Long sandwichNo;

    public MeatDto() {}

    public MeatDto fromEntity(BaseMeat meat) {
        setType(meat.getClass().getSimpleName());
        setSandwichNo(meat.getSandwichNo());

        return this;
    }
}
