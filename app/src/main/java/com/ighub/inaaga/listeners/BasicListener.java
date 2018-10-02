package com.ighub.inaaga.listeners;

import com.ighub.inaaga.model.BasicBean;

public interface BasicListener {

    void onLoadCompleted(BasicBean basicBean);

    void onLoadFailed(String error);

}
