package com.ighub.inaaga.net.invokers;


import org.json.JSONObject;

import java.util.HashMap;

import com.ighub.inaaga.model.LocationBean;
import com.ighub.inaaga.net.ServiceNames;
import com.ighub.inaaga.net.WebConnector;
import com.ighub.inaaga.net.parsers.LocationSaveParser;
import com.ighub.inaaga.net.utils.WSConstants;

public class LocationSaveInvoker extends BaseInvoker {

    public LocationSaveInvoker() {
        super();
    }

    public LocationSaveInvoker(HashMap<String, String> urlParams,
                               JSONObject postData) {
        super(urlParams, postData);
    }

    public LocationBean invokeLocationSaveWS() {

        System.out.println("POSTDATA>>>>>>>" + postData);

        WebConnector webConnector;

        webConnector = new WebConnector(new StringBuilder(ServiceNames.LOCATION_SAVE), WSConstants.PROTOCOL_HTTP, null, postData);

        String wsResponseString = webConnector.connectToPOST_service();

        System.out.println(">>>>>>>>>>> response: " + wsResponseString);
        LocationBean locationBean = null;
        if (wsResponseString.equals("")) {

            return locationBean = null;

        } else {
            locationBean = new LocationBean();
            LocationSaveParser locationSaveParser = new LocationSaveParser();
            locationBean = locationSaveParser.parseLocationSaveResponse(wsResponseString);
            return locationBean;
        }
    }
}
