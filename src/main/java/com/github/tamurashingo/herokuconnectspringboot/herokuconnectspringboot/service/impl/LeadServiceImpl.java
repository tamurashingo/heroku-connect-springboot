package com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.service.impl;

import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.HerokuconnectException;
import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.mapper.LeadMapper;
import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.model.Lead;
import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.service.LeadService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class LeadServiceImpl implements LeadService {

    private final LeadMapper mapper;

    public LeadServiceImpl(final LeadMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Lead> findAll() throws HerokuconnectException {
        return this.mapper.selectAll();
    }
}
