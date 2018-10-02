package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.SuccessBean;

public interface SuccessListener {

    void onLoadCompleted(SuccessBean successBean);

    void onLoadFailed(String error);
}
