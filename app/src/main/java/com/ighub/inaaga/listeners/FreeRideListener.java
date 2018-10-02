package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.FreeRideBean;

public interface FreeRideListener {

    void onLoadCompleted(FreeRideBean freeRideBean);

    void onLoadFailed(String error);

}
