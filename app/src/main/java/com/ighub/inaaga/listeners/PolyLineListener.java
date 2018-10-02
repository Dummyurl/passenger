package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.PlaceBean;

public interface PolyLineListener {

    void onLoadFailed(String error);

    void onLoadCompleted(PlaceBean placeBean);
}
