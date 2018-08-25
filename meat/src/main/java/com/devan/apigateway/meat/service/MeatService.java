package com.devan.apigateway.meat.service;

import com.devan.apigateway.meat.dao.model.Bacon;
import com.devan.apigateway.meat.dao.model.Ham;
import com.devan.apigateway.meat.dao.repository.BaconRepository;
import com.devan.apigateway.meat.dao.repository.HamRepository;
import com.devan.apigateway.meat.web.MeatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeatService {

    final
    BaconRepository baconRepository;

    final
    HamRepository hamRepository;

    @Autowired
    public MeatService(BaconRepository baconRepository, HamRepository hamRepository) {
        this.baconRepository = baconRepository;
        this.hamRepository = hamRepository;
    }

    public long getCount(Class meat){
        if(meat.getSimpleName().equals("Bacon")){

            return baconRepository.count();
        }
        else if(meat.getSimpleName().equals("Ham")){

            return hamRepository.count();
        }

        return 0;
    }

    public List<MeatDto> prepareBacon(int amount, Long sandwichNo) {
        List<MeatDto> meatList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Bacon bacon = new Bacon(sandwichNo);
            baconRepository.save(bacon);
            meatList.add(new MeatDto().fromEntity(bacon));
        }

        return meatList;
    }

    public List<MeatDto> prepareHam(int amount, Long sandwichNo) {
        List<MeatDto> meatList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Ham ham = new Ham(sandwichNo);
            hamRepository.save(ham);
            meatList.add(new MeatDto().fromEntity(ham));
        }

        return meatList;
    }
}
