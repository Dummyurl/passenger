package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.LocationBean;

public interface SavedLocationListener {

    void onLoadCompleted(LocationBean locationBean);

    void onLoadFailed(String error);

}
