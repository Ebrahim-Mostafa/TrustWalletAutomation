package setups;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.Capabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static pages.WelcomePage.driver;

public class DriverSetup extends DriverPool {

    private AppiumDriverLocalService service;

    protected void prepareAutomation() {
//        Capabilities capabilities = new Capabilities();
//        capabilities.localAndroid();
//        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);//capabilities.localAndroid()
        setDriverInstance(driver);
        System.out.println("Driver: " + driver);
    }

    protected void startAppium() throws Exception {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("URL: " + service_url);
    }

    protected void stopAppium() {
        service.stop();
    }
}