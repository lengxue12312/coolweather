package com.coolweather.coolweather.gson;

/**
 * Created by chh1 on 2018/1/3.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
