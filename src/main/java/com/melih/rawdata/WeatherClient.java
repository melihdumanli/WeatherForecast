package main.java.com.melih.rawdata;

import main.java.com.melih.user.UserClient;
import main.java.com.melih.utils.LogUtil;

public class WeatherClient implements Runnable {
    private static final String NAME = "Weather Client";

    @Override
    public void run() {
        LogUtil.getInstance().logInfo(WeatherClient.NAME + " is up and running.");
        try {
            for (int i = 0; i < 0; i++) {
                LogUtil.getInstance().logInfo(WeatherClient.NAME + "-counter: " + i);
                Thread.sleep(2500);
            }
        } catch (InterruptedException e) {
            LogUtil.getInstance().logError(this.getClass().getSimpleName() + "-->" + e.getMessage());
        }
    }
}
