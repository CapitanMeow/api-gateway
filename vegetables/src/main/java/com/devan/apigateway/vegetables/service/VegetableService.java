package com.devan.apigateway.vegetables.service;

import com.devan.apigateway.vegetables.dao.repository.LettuceRepository;
import com.devan.apigateway.vegetables.dao.repository.TomatoRepository;
import com.devan.apigateway.vegetables.web.dto.LettuceDto;
import com.devan.apigateway.vegetables.web.dto.TomatoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableService {

    private final TomatoRepository tomatoRepository;

    private final LettuceRepository lettuceRepository;

    @Autowired
    public VegetableService(TomatoRepository tomatoRepository, LettuceRepository lettuceRepository){
        this.tomatoRepository = tomatoRepository;
        this.lettuceRepository = lettuceRepository;
    }

    public long getCount(Class meat) {
        if (meat.getSimpleName().equals("Tomato")) {

            return tomatoRepository.count();
        } else if (meat.getSimpleName().equals("Lettuce")) {

            return lettuceRepository.count();
        }

        throw new IllegalArgumentException("Bad class name");
    }

    public void prepareTomato(List<TomatoDto> tomatoList) {
        tomatoList
                .forEach(tomatoDto -> tomatoRepository.save(tomatoDto.toEntity()));
    }

    public void prepareLettuce(List<LettuceDto> lettuceList) {
        lettuceList
                .forEach(lettuceDto -> lettuceRepository.save(lettuceDto.toEntity()));
    }
}
