package com.ighub.inaaga.listeners;

import com.ighub.inaaga.model.BasicBean;

public interface OTPResendCodeListener {

    void onLoadCompleted(BasicBean basicBean);

    void onLoadFailed(String error);
}
