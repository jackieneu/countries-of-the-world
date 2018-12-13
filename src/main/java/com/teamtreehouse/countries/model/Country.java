package com.teamtreehouse.countries.model;

import java.util.Collections;
import java.util.List;

public class Country {
    private String name;
    private int population;
    private String capitalCity;
    private List<String> officialLanguages;

    public Country(String name, int population, String capitalCity, List<String> officialLanguages) {
        this.name = name;
        this.population = population;
        this.capitalCity = capitalCity;
        this.officialLanguages = officialLanguages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public List<String> getOfficialLanguages() {
        Collections.sort(officialLanguages);
        return officialLanguages;
    }

    public void addOfficialLanguages(String officialLanguage) {
        this.officialLanguages.add(officialLanguage);
    }
}
