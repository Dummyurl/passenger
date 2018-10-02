package com.ighub.inaaga.net.invokers;


import org.json.JSONObject;

import java.util.HashMap;

import com.ighub.inaaga.model.CarBean;
import com.ighub.inaaga.net.ServiceNames;
import com.ighub.inaaga.net.WebConnector;
import com.ighub.inaaga.net.parsers.CarInfoParser;
import com.ighub.inaaga.net.utils.WSConstants;

public class CarInfoInvoker extends BaseInvoker {

    public CarInfoInvoker(HashMap<String, String> urlParams,
                          JSONObject postData) {
        super(urlParams, postData);
    }

    public CarBean invokeCarInfoWS() {

        WebConnector webConnector;

        webConnector = new WebConnector(new StringBuilder(ServiceNames.CAR_AVAILABILITY), WSConstants.PROTOCOL_HTTP, urlParams, null);

        //webConnector= new WebConnector(new StringBuilder(ServiceNames.MODELS), WSConstants.PROTOCOL_HTTP, null);
//    String wsResponseString=webConnector.connectToPOST_service();
        String wsResponseString = webConnector.connectToGET_service(true);
        System.out.println(">>>>>>>>>>> response: " + wsResponseString);
        CarBean carBean = null;
        if (wsResponseString.equals("")) {
            return carBean = null;
        } else {
            carBean = new CarBean();
            CarInfoParser carInfoParser = new CarInfoParser();
            carBean = carInfoParser.parseCarInfoResponse(wsResponseString);
            return carBean;
        }
    }
}
