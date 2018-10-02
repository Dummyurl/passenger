package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.DriverBean;

public interface AppStatusListener {

    void onLoadFailed(String error);

    void onLoadCompleted(DriverBean driverBean);

}
