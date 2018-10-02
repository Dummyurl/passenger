package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.RequestBean;

public interface RequestStatusListener {

    void onLoadCompleted(RequestBean requestBean);

    void onLoadFailed(String error);
}
