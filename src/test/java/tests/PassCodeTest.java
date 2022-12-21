package tests;

import org.testng.annotations.Test;
import pages.WelcomePage;
import setups.BaseDeviceTest;

import java.io.IOException;

public class PassCodeTest extends BaseDeviceTest {

    public WelcomePage wp = new WelcomePage();

    @Test(priority = 18)
    public void createPassCode() throws IOException, InterruptedException {
        wp.clickAlreadyHaveWalletBtn();
        Process process1 = Runtime.getRuntime().exec("adb shell input keyevent 188");//1
        Process process2 = Runtime.getRuntime().exec("adb shell input keyevent 189");//2
        Process process3 = Runtime.getRuntime().exec("adb shell input keyevent 190");//3
        Process process4 = Runtime.getRuntime().exec("adb shell input keyevent 191");//4
        Process process5 = Runtime.getRuntime().exec("adb shell input keyevent 192");//5
        Process process6 = Runtime.getRuntime().exec("adb shell input keyevent 193");//6
    }

    @Test(priority = 19)
    public void confirmWithWrongPassCode() throws IOException, InterruptedException {
        Thread.sleep(10000);
        Process process1 = Runtime.getRuntime().exec("adb shell input keyevent 188");//1
        Process process2 = Runtime.getRuntime().exec("adb shell input keyevent 188");//2
        Process process3 = Runtime.getRuntime().exec("adb shell input keyevent 188");//3
        Process process4 = Runtime.getRuntime().exec("adb shell input keyevent 188");//4
        Process process5 = Runtime.getRuntime().exec("adb shell input keyevent 188");//5
        Process process6 = Runtime.getRuntime().exec("adb shell input keyevent 188");//6
    }

    @Test(priority = 20)
    public void confirmWithCorrectPassCode() throws IOException, InterruptedException {
        Thread.sleep(10000);
        Process process1 = Runtime.getRuntime().exec("adb shell input keyevent 188");//1
        Process process2 = Runtime.getRuntime().exec("adb shell input keyevent 189");//2
        Process process3 = Runtime.getRuntime().exec("adb shell input keyevent 190");//3
        Process process4 = Runtime.getRuntime().exec("adb shell input keyevent 191");//4
        Process process5 = Runtime.getRuntime().exec("adb shell input keyevent 192");//5
        Process process6 = Runtime.getRuntime().exec("adb shell input keyevent 193");//6
    }
}
