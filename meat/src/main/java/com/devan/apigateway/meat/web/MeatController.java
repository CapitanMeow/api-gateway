package com.devan.apigateway.meat.web;

import com.devan.apigateway.meat.dao.model.Bacon;
import com.devan.apigateway.meat.dao.model.Ham;
import com.devan.apigateway.meat.service.MeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class MeatController {

    final
    MeatService service;

    @Autowired
    public MeatController(MeatService service) {
        this.service = service;
    }

    @PostMapping(value = "bacon")
    public List<MeatDto> createBacon(@RequestParam Long sandwichNo, @RequestParam int amount) {

       return service.prepareBacon(amount, sandwichNo);
    }

    @PostMapping(value = "ham")
    public List<MeatDto> createHam(@RequestParam Long sandwichNo, @RequestParam int amount) {

        return service.prepareHam(amount, sandwichNo);
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
