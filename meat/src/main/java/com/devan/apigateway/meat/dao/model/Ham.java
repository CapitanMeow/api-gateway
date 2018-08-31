package com.devan.apigateway.meat.dao.model;

import com.devan.apigateway.meat.dao.enums.HamType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity(name = "HAM")
@Getter
@Setter
public class Ham extends BaseMeat {

    @Enumerated(EnumType.STRING)
    private HamType type;
}
