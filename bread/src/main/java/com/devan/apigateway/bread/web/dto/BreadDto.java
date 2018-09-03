package com.devan.apigateway.bread.web.dto;

import com.devan.apigateway.bread.dao.BreadType;
import com.devan.apigateway.bread.dao.model.Bread;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BreadDto implements Serializable {

  @NotNull
  @NotEmpty
  private String sandwichNo;

  @NotNull
  private BreadType type;

  public Bread toEntity(){
    Bread bread = new Bread();
    bread.setSandwichNo(sandwichNo);
    bread.setType(type);

    return bread;
  }
}
