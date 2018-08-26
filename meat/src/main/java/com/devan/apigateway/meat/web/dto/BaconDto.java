package com.devan.apigateway.meat.web.dto;

import com.devan.apigateway.meat.dao.enums.BaconType;
import com.devan.apigateway.meat.dao.model.Bacon;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Setter
@Getter
public class BaconDto extends MeatDto {

    public BaconType type;

    public BaconDto fromEntity(Bacon bacon) {
        setType(bacon.getType());
        setSandwichNo(bacon.getSandwichNo());

        return this;
    }

    public Bacon toEntity() {
        Bacon bacon = new Bacon();
        bacon.setType(getType());
        bacon.setSandwichNo(getSandwichNo());
        bacon.setCreationDate(ZonedDateTime.now());

        return bacon;
    }
}
