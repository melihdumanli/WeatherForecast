package main.java.com.bilgeadam.rawdata;

import main.java.com.bilgeadam.utils.LogUtil;

import java.util.logging.Logger;

public class WeatherClient  implements Runnable{
    private static final String NAME = "Weather Client";

    @Override
    public void run() {
        LogUtil.getInstance().
        System.out.println(WeatherClient.NAME + " is up and running.");
    }
}
