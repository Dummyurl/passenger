package com.ighub.inaaga.listeners;

import com.ighub.inaaga.model.OTPBean;


public interface OTPSubmitListener {

    void onLoadCompleted(OTPBean otpBean);

    void onLoadFailed(String error);

}
