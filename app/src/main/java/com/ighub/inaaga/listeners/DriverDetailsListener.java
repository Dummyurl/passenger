package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.DriverBean;

public interface DriverDetailsListener {

    void onLoadCompleted(DriverBean driverBean);

    void onLoadFailed(String error);
}
