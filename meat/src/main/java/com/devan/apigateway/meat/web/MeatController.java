package com.devan.apigateway.meat.web;

import com.devan.apigateway.meat.dao.model.Bacon;
import com.devan.apigateway.meat.dao.model.Ham;
import com.devan.apigateway.meat.service.MeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class MeatController {

    @Autowired
    MeatService service;

    @PostMapping(value = "bacon")
    public void createBacon(@RequestParam int amount){

        service.prepareBacon(amount);
    }

    @PostMapping(value = "ham")
    public void createHam(@RequestParam int amount){
        service.prepareHam(amount);
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
