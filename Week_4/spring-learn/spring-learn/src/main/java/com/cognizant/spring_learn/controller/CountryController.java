package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class CountryController {

    private static final Logger LOGGER = Logger.getLogger(CountryController.class.getName());

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START - getCountry()");
        Country country = countryService.getCountry(code);
        LOGGER.info("END - getCountry()");
        return country;
    }
}

