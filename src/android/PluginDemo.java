package com.dockbite.plugindemo;

import android.widget.Toast;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * This class echoes a string called from JavaScript.
 */
public class PluginDemo extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(action.equals("nativeToast")){
            nativeToast();
        }
    }

    private void coolMethod() {
        Toast.makeText(webView.getContext(), "Hello World Cordova Plugin", Toast.LENGTH_SHORT).show();
    }
}
