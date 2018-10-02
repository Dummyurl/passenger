package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.UserBean;

public interface EditProfileListener {

    void onLoadCompleted(UserBean userBean);

    void onLoadFailed(String error);

}
