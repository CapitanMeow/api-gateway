package com.devan.apigateway.meat.dao.model;

import com.devan.apigateway.meat.dao.enums.BaconType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity(name = "BACON")
@Getter
@Setter
public class Bacon extends BaseMeat{

    @Enumerated(EnumType.STRING)
    private BaconType type;
}
