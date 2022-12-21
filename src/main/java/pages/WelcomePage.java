package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import setups.BaseDeviceTest;

public class WelcomePage extends BaseDeviceTest {

    public static AndroidDriver driver;

//    public WelcomePage() {
//    }

//    public WelcomePage(AndroidDriver driver ){
//        this.driver=driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//    }

//    public WelcomePage(AppiumDriver<?> driver) {
//        this.driver= (AndroidDriver) driver;
//        PageFactory.initElements(driver, this);
//    }

//     @FindBy(id = "com.wallet.crypto.trustapp:id/title")
//     Private and secure
//    public AndroidElement privateAndSecureTitle;

//    @FindBy(id = "com.wallet.crypto.trustapp:id/img")
//    public AndroidElement trustWalletAppLogo;
//    public By trustWalletAppLogo = By.id("com.wallet.crypto.trustapp:id/img");


    public By trustWalletAppLogo = By.id("com.wallet.crypto.trustapp:id/img");

    public By privateAndSecureTitle = By.id("com.wallet.crypto.trustapp:id/title");

    public By privateAndSecureMessage = By.id("com.wallet.crypto.trustapp:id/message");

    public By createNewWalletBtn = By.id("com.wallet.crypto.trustapp:id/new_account_action");

    public By alreadyHaveWalletBtn = By.id("com.wallet.crypto.trustapp:id/import_account_action");


    public boolean CheckTrusWalletAppLogoIsDisplayed(){
        try {
            element(trustWalletAppLogo).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CheckPrivateAndSecureTitleIsDisplayed(){
        try {
            element(privateAndSecureTitle).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkPrivateAndSecureMessageIsDisplayed(){
        try {
            element(privateAndSecureMessage).isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkCreateNewWalletBtnIsDisplayed() {
        try {
            element(createNewWalletBtn).isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkAlreadyHaveWalletBtnIsDisplayed() {
        try {
            element(alreadyHaveWalletBtn).isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alreadyHaveWalletBtnIsEnabled() {
        try {
            element(alreadyHaveWalletBtn).isEnabled();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickAlreadyHaveWalletBtn(){
        element(alreadyHaveWalletBtn).click();;
    }
}