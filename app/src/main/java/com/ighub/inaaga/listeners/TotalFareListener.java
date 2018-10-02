package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.FareBean;

public interface TotalFareListener {

    void onLoadCompleted(FareBean fareBean);

    void onLoadFailed(String error);
}
