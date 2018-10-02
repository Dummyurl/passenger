package com.ighub.inaaga.net.WSAsyncTasks;


import android.os.AsyncTask;

import java.util.HashMap;

import com.ighub.inaaga.model.RequestBean;
import com.ighub.inaaga.net.invokers.RequestStatusInvoker;

public class RequestStatusTask extends AsyncTask<String, Integer, RequestBean> {

    private RequestStatusTask.RequestStatusTaskListener requestStatusTaskListener;

    private HashMap<String, String> urlParams;

    public RequestStatusTask(HashMap<String, String> urlParams) {
        super();
        this.urlParams = urlParams;
    }

    @Override
    protected RequestBean doInBackground(String... params) {

        System.out.println(">>>>>>>>>doInBackground");
        RequestStatusInvoker requestStatusInvoker = new RequestStatusInvoker(urlParams, null);
        return requestStatusInvoker.invokeRequestStatusWS();
    }

    @Override
    protected void onPostExecute(RequestBean result) {
        if (result != null)
            requestStatusTaskListener.dataDownloadedSuccessfully(result);
        else
            requestStatusTaskListener.dataDownloadFailed();
    }

    public interface RequestStatusTaskListener {

        void dataDownloadedSuccessfully(RequestBean requestBean);

        void dataDownloadFailed();

    }

    public RequestStatusTaskListener getRequestStatusTaskListener() {
        return requestStatusTaskListener;
    }

    public void setRequestStatusTaskListener(RequestStatusTaskListener requestStatusTaskListener) {
        this.requestStatusTaskListener = requestStatusTaskListener;
    }
}
