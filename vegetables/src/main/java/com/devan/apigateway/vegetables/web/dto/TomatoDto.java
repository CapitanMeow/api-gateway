package com.devan.apigateway.vegetables.web.dto;

import com.devan.apigateway.vegetables.dao.enums.TomatoType;
import com.devan.apigateway.vegetables.dao.model.Tomato;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class TomatoDto extends VegetableDto {
    
    private TomatoType type;

    public TomatoDto fromEntity(Tomato tomato) {
        setType(tomato.getType());
        setSandwichNo(tomato.getSandwichNo());

        return this;
    }

    public Tomato toEntity() {
        Tomato tomato = new Tomato();
        tomato.setType(getType());
        tomato.setSandwichNo(getSandwichNo());
        tomato.setCreationDate(ZonedDateTime.now());

        return tomato;
    }
}
