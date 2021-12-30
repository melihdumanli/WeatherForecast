package main.java.com.melih;

import main.java.com.melih.business.BusinessClient;
import main.java.com.melih.rawdata.WeatherClient;
import main.java.com.melih.user.UserClient;
import main.java.com.melih.utils.LogUtil;

public class WeatherManagement {
    public static void main(String[] args) {
        LogUtil.getInstance().logInfo("Weather Management System is starting.");

        /*BusinessClient businessClient = new BusinessClient();
        new Thread(businessClient, businessClient.getClass().getSimpleName()).start();
        //(new BusinessClient()).run();

        WeatherClient weatherClient = new WeatherClient();
        new Thread(weatherClient, weatherClient.getClass().getSimpleName()).start();*/
        //(new WeatherClient()).run();

        UserClient userClient = new UserClient();
        new Thread(userClient, userClient.getName()).start();
        /*(new UserClient()).run();*/
        LogUtil.getInstance().logInfo("Weather Management System is started.");


    }
}
