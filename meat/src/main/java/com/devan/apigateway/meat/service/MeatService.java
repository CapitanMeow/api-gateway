package com.devan.apigateway.meat.service;

import com.devan.apigateway.meat.dao.repository.BaconRepository;
import com.devan.apigateway.meat.dao.repository.HamRepository;
import com.devan.apigateway.meat.web.dto.BaconDto;
import com.devan.apigateway.meat.web.dto.HamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public long getCount(Class meat) {
        if (meat.getSimpleName().equals("Bacon")) {

            return baconRepository.count();
        } else if (meat.getSimpleName().equals("Ham")) {

            return hamRepository.count();
        }

        throw new IllegalArgumentException("Bad class name");
    }

    public void prepareBacon(List<BaconDto> baconList) {
        baconList.stream()
                .forEach(baconDto -> baconRepository.save(baconDto.toEntity()));
    }

    public void prepareHam(List<HamDto> hamList) {
        hamList.stream()
                .forEach(hamDto -> hamRepository.save(hamDto.toEntity()));
    }
}
