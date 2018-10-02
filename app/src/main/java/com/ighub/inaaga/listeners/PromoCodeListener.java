package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.PromoCodeBean;

public interface PromoCodeListener {

    void onLoadCompleted(PromoCodeBean promoCodeBean);

    void onLoadFailed(String error);

}
