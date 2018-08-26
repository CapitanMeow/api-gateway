package com.devan.apigateway.vegetables.web;

import com.devan.apigateway.vegetables.dao.model.Lettuce;
import com.devan.apigateway.vegetables.dao.model.Tomato;
import com.devan.apigateway.vegetables.service.VegetableService;
import com.devan.apigateway.vegetables.web.dto.LettuceDto;
import com.devan.apigateway.vegetables.web.dto.TomatoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class VegetableController {

    final
    VegetableService service;

    @Autowired
    public VegetableController(VegetableService service) {
        this.service = service;
    }

    @PostMapping(value = "tomato")
    public ResponseEntity createTomato(@RequestBody List<TomatoDto> tomatoList) {

        service.prepareTomato(tomatoList);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PostMapping(value = "lettuce")
    public ResponseEntity createLettuce(@RequestBody List<LettuceDto> lettuceList) {
        service.prepareLettuce(lettuceList);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = "tomato")
    public Long getTomatoCount() {

        return service.getCount(Tomato.class);
    }

    @GetMapping(value = "lettuce")
    public Long getLettuceCount() {

        return service.getCount(Lettuce.class);
    }
}
