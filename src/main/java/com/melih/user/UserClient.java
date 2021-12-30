package main.java.com.melih.user;

import main.java.com.melih.utils.LogUtil;

public class UserClient implements Runnable {
    private static final String NAME = "User Client";

    public UserClient() {
        super();
    }

    @Override
    public void run() {
        LogUtil.getInstance().logInfo(UserClient.NAME + " is up and running.");
        try {
            for (int i = 0; i < 20; i++) {
                LogUtil.getInstance().logInfo(UserClient.NAME + "-counter: " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            LogUtil.getInstance().logError(this.getClass().getSimpleName() + "-->" + e.getMessage());
        }
    }

    public String getName() {
        return UserClient.NAME;
    }
}

