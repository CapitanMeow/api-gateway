package com.devan.apigateway.meat.web;

import com.devan.apigateway.meat.dao.model.Bacon;
import com.devan.apigateway.meat.dao.model.Ham;
import com.devan.apigateway.meat.service.MeatService;
import com.devan.apigateway.meat.web.dto.BaconDto;
import com.devan.apigateway.meat.web.dto.HamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class MeatController extends BaseController{

    final
    MeatService service;

    @Autowired
    public MeatController(MeatService service) {
        this.service = service;
    }

    @PostMapping(value = "bacon")
    public ResponseEntity createBacon(@RequestBody List<BaconDto> baconList) {

        service.prepareBacon(baconList);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PostMapping(value = "ham")
    public ResponseEntity createHam(@RequestBody List<HamDto> hamList) {
        service.prepareHam(hamList);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = "bacon")
    public Long getBaconCount() {

        return service.getCount(Bacon.class);
    }

    @GetMapping(value = "ham")
    public Long getHamCount() {

        return service.getCount(Ham.class);
    }
}
