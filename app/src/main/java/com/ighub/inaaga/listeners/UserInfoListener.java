package com.ighub.inaaga.listeners;


import com.ighub.inaaga.model.UserBean;

public interface UserInfoListener {

    void onLoadCompleted(UserBean userBean);

    void onLoadFailed(String error);

}
