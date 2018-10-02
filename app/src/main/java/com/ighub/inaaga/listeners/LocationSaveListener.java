package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.LocationBean;

public interface LocationSaveListener {

    void onLoadCompleted(LocationBean locationBean);

    void onLoadFailed(String error);
}


