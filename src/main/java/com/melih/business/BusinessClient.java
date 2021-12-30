package main.java.com.melih.business;

import main.java.com.melih.user.UserClient;
import main.java.com.melih.utils.LogUtil;

public class BusinessClient implements Runnable {
    private static final String NAME = "Business Client";

    @Override
    public void run() {
        LogUtil.getInstance().logInfo(BusinessClient.NAME + " is up and running.");
        try {
            for (int i = 0; i < 20; i++) {
                LogUtil.getInstance().logInfo(BusinessClient.NAME + "-counter: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            LogUtil.getInstance().logError(this.getClass().getSimpleName() + "-->" + e.getMessage());
        }
    }
}
