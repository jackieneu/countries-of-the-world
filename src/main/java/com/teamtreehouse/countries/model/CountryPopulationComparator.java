package com.teamtreehouse.countries.model;

import java.util.Comparator;

public class CountryPopulationComparator implements Comparator<Country> {
    @Override
    public int compare(Country cnt1, Country cnt2){
        if(cnt1.equals(cnt2)){
            return 0;
        }
        if(cnt1.getPopulation() > cnt2.getPopulation()){
            return 1;
        }else if(cnt1.getPopulation() < cnt2.getPopulation()){
            return -1;
        }else{
            return 0;
        }
    }
}
