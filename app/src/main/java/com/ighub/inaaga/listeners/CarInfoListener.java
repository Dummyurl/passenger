package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.CarBean;

public interface CarInfoListener {

    void onLoadFailed(String error);

    void onLoadCompleted(CarBean carBean);

}
