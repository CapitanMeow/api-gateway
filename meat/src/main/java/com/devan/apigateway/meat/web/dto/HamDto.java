package com.devan.apigateway.meat.web.dto;

import com.devan.apigateway.meat.dao.enums.HamType;
import com.devan.apigateway.meat.dao.model.Ham;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class HamDto extends MeatDto {

    private HamType type;

    public HamDto fromEntity(Ham ham) {
        setType(ham.getType());
        setSandwichNo(ham.getSandwichNo());

        return this;
    }

    public Ham toEntity() {
        Ham Ham = new Ham();
        Ham.setType(getType());
        Ham.setSandwichNo(getSandwichNo());
        Ham.setCreationDate(ZonedDateTime.now());

        return Ham;
    }
}
