package com.ighub.inaaga.net.WSAsyncTasks;


import android.os.AsyncTask;

import java.util.HashMap;

import com.ighub.inaaga.model.CarBean;
import com.ighub.inaaga.net.invokers.CarInfoInvoker;

public class CarInfoTask extends AsyncTask<String, Integer, CarBean> {

    private CarInfoTask.CarInfoTaskListener carInfoTaskListener;

    private HashMap<String, String> urlParams;

    public CarInfoTask(HashMap<String, String> urlParams) {
        super();
        this.urlParams = urlParams;
    }

    /*public CarInfoTask(JSONObject urlParams) {

    }*/

    @Override
    protected CarBean doInBackground(String... params) {

        System.out.println(">>>>>>>>>doInBackground");
        CarInfoInvoker carInfoInvoker = new CarInfoInvoker(urlParams, null);
        return carInfoInvoker.invokeCarInfoWS();
    }

    @Override
    protected void onPostExecute(CarBean result) {
        if (result != null)
            carInfoTaskListener.dataDownloadedSuccessfully(result);
        else
            carInfoTaskListener.dataDownloadFailed();
    }

    public interface CarInfoTaskListener {
        void dataDownloadedSuccessfully(CarBean carBean);

        void dataDownloadFailed();
    }

    public CarInfoTaskListener getCarInfoTaskListener() {
        return carInfoTaskListener;
    }

    public void setCarInfoTaskListener(CarInfoTaskListener carInfoTaskListener) {
        this.carInfoTaskListener = carInfoTaskListener;
    }
}
