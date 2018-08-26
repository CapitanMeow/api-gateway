package com.devan.apigateway.vegetables.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity(name = "VEGETABLE")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public abstract class Vegetable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long sandwichNo;

    private ZonedDateTime creationDate;
}
