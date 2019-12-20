package com.example;

import android.content.Context;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;

import org.json.JSONObject;

public class ExampleService {
    private CallbackContext callbackContext;
    private Context context;
    private CordovaInterface cordova;

    ExampleService(Context context, CordovaInterface cordova) {
        this.context = context;
        this.cordova = cordova;
    }

    public void displayAlert(CallbackContext callbackContext, JSONObject params) {
        this.callbackContext = callbackContext;
        PluginResult result;
        try {
            Toast.makeText(context, ("Hello " + params.get("username").toString()), Toast.LENGTH_SHORT).show();

            result = new PluginResult(PluginResult.Status.OK, "Done");
            callbackContext.sendPluginResult(result);
        } catch (Exception ex) {
            result = new PluginResult(PluginResult.Status.ERROR, ex.toString());
            result.setKeepCallback(true);
            callbackContext.sendPluginResult(result);
        }
    }
}
