package com.devan.apigateway.meat.dao.model;

import com.devan.apigateway.meat.dao.enums.BaconType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity(name = "BACON")
@Getter
@Setter
public class Bacon extends BaseMeat{

    private BaconType type;
}
