package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 2018/1/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
}
