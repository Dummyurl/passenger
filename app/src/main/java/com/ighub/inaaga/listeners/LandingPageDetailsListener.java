package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.LandingPageBean;

public interface LandingPageDetailsListener {

    void onLoadCompleted(LandingPageBean landingPageListBean);

    void onLoadFailed(String error);
}
