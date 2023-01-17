package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static setups.BaseDeviceTest.element;

public class WelcomePage {

    public AppiumDriver<MobileElement> driver;

//    public static AndroidDriver driver;

//    public WelcomePage(AppiumDriver<MobileElement> driver) {
//        this.driver=driver;
//    }

//    public WelcomePage(AppiumDriver<?> driver) {
//        this.driver= (AndroidDriver) driver;
//        PageFactory.initElements(driver, this);
//    }

    public WelcomePage(AppiumDriver<MobileElement> driver ){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //    public By trustWalletAppLogo = By.id("com.wallet.crypto.trustapp:id/img");
    @FindBy(id = "com.wallet.crypto.trustapp:id/img")
    public AndroidElement trustWalletAppLogo;

//    public By privateAndSecureTitle = By.id("com.wallet.crypto.trustapp:id/title");

    @FindBy(id = "com.wallet.crypto.trustapp:id/title")
    public AndroidElement privateAndSecureTitle;

//    public By privateAndSecureMessage = By.id("com.wallet.crypto.trustapp:id/message");

    @FindBy(id = "com.wallet.crypto.trustapp:id/message")
    public AndroidElement privateAndSecureMessage;

//    public By createNewWalletBtn = By.id("com.wallet.crypto.trustapp:id/new_account_action");

    @FindBy(id = "com.wallet.crypto.trustapp:id/new_account_action")
    public AndroidElement createNewWalletBtn;

//    public By alreadyHaveWalletBtn = By.id("com.wallet.crypto.trustapp:id/import_account_action");

    @FindBy(id = "com.wallet.crypto.trustapp:id/import_account_action")
    public AndroidElement alreadyHaveWalletBtn;


    public boolean CheckTrusWalletAppLogoIsDisplayed(){
        try {
//            element(trustWalletAppLogo).isDisplayed();
            trustWalletAppLogo.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckPrivateAndSecureTitleIsDisplayed(){
        try {
//            element(privateAndSecureTitle).isDisplayed();
            privateAndSecureTitle.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkPrivateAndSecureMessageIsDisplayed(){
        try {
//            element(privateAndSecureMessage).isDisplayed();
            privateAndSecureMessage.isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkCreateNewWalletBtnIsDisplayed() {
        try {
//            element(createNewWalletBtn).isDisplayed();
            createNewWalletBtn.isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkAlreadyHaveWalletBtnIsDisplayed() {
        try {
//            element(alreadyHaveWalletBtn).isDisplayed();
            alreadyHaveWalletBtn.isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alreadyHaveWalletBtnIsEnabled() {
        try {
//            element(alreadyHaveWalletBtn).isEnabled();
            alreadyHaveWalletBtn.isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickAlreadyHaveWalletBtn(){
//        element(alreadyHaveWalletBtn).click();;
        alreadyHaveWalletBtn.click();
    }

    public void clickOnCreateNewWalletBtn(){
//        element(createANewWalletBtn).click();;
        createNewWalletBtn.click();
    }
}