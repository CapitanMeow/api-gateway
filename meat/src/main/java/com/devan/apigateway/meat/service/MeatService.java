package com.devan.apigateway.meat.service;

import com.devan.apigateway.meat.dao.model.Bacon;
import com.devan.apigateway.meat.dao.model.Ham;
import com.devan.apigateway.meat.dao.repository.BaconRepository;
import com.devan.apigateway.meat.dao.repository.BaseMeatRepository;
import com.devan.apigateway.meat.dao.repository.HamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeatService {

    final
    BaconRepository baconRepository;

    final
    HamRepository hamRepository;

    @Autowired
    public MeatService(BaseMeatRepository baseMeatRepository, BaconRepository baconRepository, HamRepository hamRepository) {
        this.baconRepository = baconRepository;
        this.hamRepository = hamRepository;
    }

    public long getCount(Class meat){
        if(meat.getName().equals("com.devan.apigateway.meat.dao.model.Bacon")){

            return baconRepository.count();
        }
        else if(meat.getName().equals("com.devan.apigateway.meat.dao.model.Ham")){

            return hamRepository.count();
        }

        return 0;
    }

    public void prepareBacon(int amount) {
        for (int i = 0; i < amount; i++) {
            Bacon bacon = new Bacon();

            baconRepository.save(bacon);
        }
    }

    public void prepareHam(int amount) {
        for (int i = 0; i < amount; i++) {
            Ham ham = new Ham();

            hamRepository.save(ham);
        }
    }

}
