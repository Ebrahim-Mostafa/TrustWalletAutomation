package setups;

import io.appium.java_client.android.AndroidDriver;

public class DriverPool {

    private static AndroidDriver driverInstance;

    public static AndroidDriver getDriverInstance() {

        return DriverPool.driverInstance;
    }

    public void setDriverInstance(AndroidDriver instance) {

        DriverPool.driverInstance = instance;
    }
}