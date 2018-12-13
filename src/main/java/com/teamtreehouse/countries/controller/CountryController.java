package com.teamtreehouse.countries.controller;

import com.teamtreehouse.countries.data.CountryRepository;
import com.teamtreehouse.countries.model.Country;
import com.teamtreehouse.countries.model.CountryNameComparator;
import com.teamtreehouse.countries.model.CountryPopulationComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listCountries(ModelMap modelMap){
        List<Country> allCountries = countryRepository.getAllCountries();
        modelMap.put("countries", allCountries);
        return "index";
    }

    @RequestMapping("/country/{name}")
    public String countryDetails(@PathVariable String name, ModelMap modelMap){
        Country country = countryRepository.findByName(name);
        modelMap.put("country", country);
        return "country-detail";
    }

    @RequestMapping("/sortByName")
    public String listCountriesByName(ModelMap modelMap){
        List<Country> allCountires = countryRepository.getAllCountries();
        Collections.sort(allCountires, new CountryNameComparator());
        modelMap.put("countries", allCountires);
        return "index";
    }

    @RequestMapping("/sortByPopulation")
    public String listCountriesByPopulation(ModelMap modelMap){
        List<Country> allCountires = countryRepository.getAllCountries();
        Collections.sort(allCountires, new CountryPopulationComparator());
        modelMap.put("countries", allCountires);
        return "index";
    }
}
