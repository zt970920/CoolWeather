package com.coolweather.android.util;

import android.text.TextUtils;

import com.coolweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.jar.JarException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by user on 2018/1/2
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String adress, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }

}