package com.devan.apigateway.bread.web.controller;

import com.devan.apigateway.bread.service.BreadService;
import com.devan.apigateway.bread.web.dto.BreadDto;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class BreadController extends BaseController{

  private final BreadService service;

  public BreadController(BreadService breadService){
    this.service = breadService;
  }

  @PostMapping(value = "bread")
  public ResponseEntity<Long> create(@RequestBody @Valid  BreadDto dto){

    return new ResponseEntity<>( service.prepareBread(dto), HttpStatus.CREATED);
  }

  @GetMapping(value = "bread")
  public ResponseEntity<Long> count() {

    return new ResponseEntity<>(service.getCount(), HttpStatus.OK);
  }
}
