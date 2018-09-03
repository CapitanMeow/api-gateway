package com.devan.apigateway.bread.dao.model;

import com.devan.apigateway.bread.dao.BreadType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "BREAD")
@Getter
@Setter
public class Bread {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  private BreadType type;

  private String sandwichNo;
}
