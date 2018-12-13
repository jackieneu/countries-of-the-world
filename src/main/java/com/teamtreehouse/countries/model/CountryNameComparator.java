package com.teamtreehouse.countries.model;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country> {

    @Override
    public int compare(Country cnt1, Country cnt2){
        if(cnt1.equals(cnt2)){
            return 0;
        }
        return cnt1.getName().compareTo(cnt2.getName());
    }
}
