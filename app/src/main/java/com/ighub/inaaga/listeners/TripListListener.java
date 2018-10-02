package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.TripListBean;

public abstract interface TripListListener {

    void onLoadCompleted(TripListBean tripListBean);

    void onLoadFailed(String error);

}
