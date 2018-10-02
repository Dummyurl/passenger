package com.ighub.inaaga.net.WSAsyncTasks;


import android.os.AsyncTask;

import java.util.HashMap;

import com.ighub.inaaga.model.TripDetailsBean;
import com.ighub.inaaga.net.invokers.TripDetailsInvoker;

public class TripDetailsTask extends AsyncTask<String, Integer, TripDetailsBean> {

    private TripDetailsTaskListener tripDetailsTaskListener;

    private HashMap<String, String> urlParams;

    public TripDetailsTask(HashMap<String, String> urlParams) {
        super();
        this.urlParams = urlParams;
    }

    @Override
    protected TripDetailsBean doInBackground(String... params) {
        System.out.println(">>>>>>>>>doInBackground");
        TripDetailsInvoker tripDetailsInvoker = new TripDetailsInvoker(urlParams, null);
        return tripDetailsInvoker.invokeTripDetailsWS();
    }

    @Override
    protected void onPostExecute(TripDetailsBean result) {
        if (result != null)
            tripDetailsTaskListener.dataDownloadedSuccessfully(result);
        else
            tripDetailsTaskListener.dataDownloadFailed();
    }

    public interface TripDetailsTaskListener {

        void dataDownloadedSuccessfully(TripDetailsBean tripDetailsBean);

        void dataDownloadFailed();
    }

    public TripDetailsTaskListener getTripDetailsTaskListener() {
        return tripDetailsTaskListener;
    }

    public void setTripDetailsTaskListener(TripDetailsTaskListener tripDetailsTaskListener) {
        this.tripDetailsTaskListener = tripDetailsTaskListener;
    }
}
