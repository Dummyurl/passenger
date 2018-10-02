package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.LandingPageBean;

public interface LandingPageListener {

    void onLoadFailed(String error);

    void onLoadCompleted(LandingPageBean landingPageBean);

}
