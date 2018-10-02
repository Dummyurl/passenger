package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.AuthBean;

public interface RegistrationListener {

    void onLoadCompleted(AuthBean authBean);

    void onLoadFailed(String error);

}
