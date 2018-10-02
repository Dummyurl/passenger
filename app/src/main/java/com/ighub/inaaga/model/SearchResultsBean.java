package com.ighub.inaaga.model;


import com.google.android.gms.location.places.Place;

import java.util.List;

public class SearchResultsBean extends BaseBean {

    private List<Place> place;

    public List<Place> getPlace() {
        return place;
    }

    public void setPlace(List<Place> place) {
        this.place = place;
    }

}
