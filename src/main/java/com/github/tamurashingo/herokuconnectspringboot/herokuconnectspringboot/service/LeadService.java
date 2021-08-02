package com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.service;

import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.HerokuconnectException;
import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.model.Lead;

import java.util.List;

public interface LeadService {

    List<Lead> findAll() throws HerokuconnectException;

    public static class LeadServiceException extends HerokuconnectException {
        private static final long serialVersionUID = 1L;

        public LeadServiceException(String message) {
            super(message);
        }

        public LeadServiceException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
