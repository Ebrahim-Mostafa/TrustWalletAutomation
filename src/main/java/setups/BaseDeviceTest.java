package setups;

import com.testinium.deviceinformation.DeviceInfo;
import com.testinium.deviceinformation.DeviceInfoImpl;
import com.testinium.deviceinformation.device.DeviceType;
import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.model.Device;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;

import static setups.DriverPool.getDriverInstance;

public class BaseDeviceTest extends AbstractTestNGCucumberTests {

    DesiredCapabilities caps = new DesiredCapabilities();
    DriverPool driverPool = new DriverPool();
    private AppiumDriverLocalService service;
    public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;
    public static Device device;
    private WebDriver webDriver;
    private String url = "https://youtu.be/CTkHK8lQcMg?t=40";
    //https://youtu.be/34jjrqiezm8?t=106

    public void deviceInfo() throws DeviceNotFoundException, IOException {
        DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ANDROID);
        device = deviceInfo.getFirstDevice();
        try {
            if (deviceInfo.anyDeviceConnected()) {
                System.out.println("Device Name - " + device.getDeviceProductName());
                System.out.println("Device id   - " + device.getUniqueDeviceID());
                System.out.println("Device Build – " + device.getBuildVersion());
                System.out.println("Device Model Name – " + device.getModelNumber());
                System.out.println("Device Android Version – " + device.getProductVersion());
                System.out.println("Device Serial Number – " + device.getSerialNumber());
                caps.setCapability("deviceName", device.getModelNumber());//37c790e4
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DeviceNotFoundException e) {
            e.printStackTrace();
        }
    }

    public DesiredCapabilities localAndroid() {
        caps.setCapability("deviceName", device.getModelNumber());
//      caps.setCapability("deviceName", "37c790e4");
        caps.setCapability("appActivity", "com.wallet.crypto.trustapp.ui.start.activity.RootHostActivity");
        caps.setCapability("appPackage", "com.wallet.crypto.trustapp");
        caps.setCapability(MobileCapabilityType.NO_RESET, false);
        caps.setCapability("unicodeKeyboard", false);
        caps.setCapability("resetkeyboard", false);
//        caps.setCapability("autoGrantPermissions", "true");
        caps.setCapability("newCommandTimeout", 4000);
        caps.setCapability("adbExecTimeout", 10000);
        return caps;
    }

    @BeforeTest
    public void androidSetup() throws IOException, DeviceNotFoundException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--incognito");
        options.setHeadless(true);
        webDriver = new ChromeDriver(options);
        webDriver.get(url);
        WebElement play = webDriver.findElement(By.xpath("//*[@id='movie_player']"));
        play.click();
        deviceInfo();
        localAndroid();
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), localAndroid());
        driverPool = new DriverPool();
        driverPool.setDriverInstance((AndroidDriver) driver);
//        Process process = Runtime.getRuntime().exec("adb shell settings put secure location_mode 3");
    }

    public void iosSetup() throws IOException, DeviceNotFoundException {
        DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.IOS);
        device = deviceInfo.getFirstDevice();
        try {
            if (deviceInfo.anyDeviceConnected()) {
                System.out.println("Device Name - " + device.getDeviceProductName());
                System.out.println("Device id   - " + device.getUniqueDeviceID());
                System.out.println("Device Build – " + device.getBuildVersion());
                System.out.println("Device Model Name – " + device.getModelNumber());
                System.out.println("Device iOS Version – " + device.getProductVersion());
                System.out.println("Device Serial Number – " + device.getSerialNumber());
                caps.setCapability("deviceName", device.getModelNumber());
                caps.setCapability("udid", device.getUniqueDeviceID());
                caps.setCapability("bundleId", device.getDeviceProductName());
                caps.setCapability(CapabilityType.VERSION, device.getProductVersion());
                caps.setCapability(MobileCapabilityType.NO_RESET, true);
                caps.setCapability("resetkeyboard", false);
                caps.setCapability("unicodeKeyboard", false);
                caps.setCapability("newCommandTimeout", 4000);
                driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DeviceNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static MobileElement element(By element) {return driver.findElement(element); }

    protected void startAppium() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("URL: " + service_url);
    }

    protected void stopAppium() {
        service.stop();
    }

    @AfterTest
    public void tearDown() {
        getDriverInstance().quit();
//        driver.quit();
//        webDriver.quit();
    }
}

