package com.devan.apigateway.meat.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Getter
@Setter
@Entity(name = "MEAT")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BaseMeat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ZonedDateTime creationDate;

    private Long sandwichNo;
}
