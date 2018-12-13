package com.teamtreehouse.countries.data;

import com.teamtreehouse.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("ecuador", 16385068, "Quito", Arrays.asList(new String[]{"Spanish"})),
            new Country("france", 67348000, "Paris", Arrays.asList(new String[]{"French"})),
            new Country ("india", 1324171354, "New Delhi", Arrays.asList(new String[]{"Hindi", "English"}) ),
            new Country("italy", 60483973, "Rome", Arrays.asList(new String[]{"Italy"})),
            new Country("kenya", 49125325, "Nairobi", Arrays.asList(new String[]{"English", "Swahili"}) )
    );

    public Country findByName(String name){
        return ALL_COUNTRIES.stream()
                .filter(country -> country.getName().equals(name))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    public List<Country> getAllCountries(){
        return ALL_COUNTRIES;
    }

}
