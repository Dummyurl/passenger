package com.ighub.inaaga.listeners;

import com.ighub.inaaga.model.TripCancellationBean;

public interface TripCancellationListener {

    void onLoadCompleted(TripCancellationBean tripCancellationBean);

    void onLoadFailed(String error);
}
