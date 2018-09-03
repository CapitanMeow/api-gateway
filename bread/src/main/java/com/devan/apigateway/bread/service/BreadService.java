package com.devan.apigateway.bread.service;

import com.devan.apigateway.bread.dao.repository.BreadRepository;
import com.devan.apigateway.bread.web.dto.BreadDto;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BreadService {

  private final BreadRepository repository;

  @Autowired
  public BreadService(BreadRepository repository) {
    this.repository = repository;
  }

  @Transactional
  public Long prepareBread(BreadDto dto){

    return repository.save(dto.toEntity()).getId();
  }

  public Long getCount() {

    return repository.count();
  }
}
