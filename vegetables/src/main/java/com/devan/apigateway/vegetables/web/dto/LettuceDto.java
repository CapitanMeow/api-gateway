package com.devan.apigateway.vegetables.web.dto;

import com.devan.apigateway.vegetables.dao.enums.LettuceType;
import com.devan.apigateway.vegetables.dao.model.Lettuce;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class LettuceDto extends VegetableDto {

    public LettuceType type;

    public LettuceDto fromEntity(Lettuce lettuce) {
        setType(lettuce.getType());
        setSandwichNo(lettuce.getSandwichNo());

        return this;
    }

    public Lettuce toEntity() {
        Lettuce lettuce = new Lettuce();
        lettuce.setType(getType());
        lettuce.setSandwichNo(getSandwichNo());
        lettuce.setCreationDate(ZonedDateTime.now());

        return lettuce;
    }
}
