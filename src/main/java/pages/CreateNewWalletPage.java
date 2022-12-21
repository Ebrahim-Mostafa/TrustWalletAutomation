package pages;

import org.openqa.selenium.By;
import setups.BaseDeviceTest;

public class CreateNewWalletPage extends BaseDeviceTest {

    public By createANewWalletBtn = By.id("com.wallet.crypto.trustapp:id/new_account_action");
    public By firstConsent = By.id("com.wallet.crypto.trustapp:id/concent1");
    public By secondtConsent = By.id("com.wallet.crypto.trustapp:id/concent2");
    public By thirdConsent = By.id("com.wallet.crypto.trustapp:id/concent3");
    public By continueBtn = By.id("com.wallet.crypto.trustapp:id/next");
    public By closeBtn = By.xpath("//android.view.View[@content-desc='Close]");
    public By enablePNBtn = By.id("com.wallet.crypto.trustapp:id/action_enable");
    public By walletMoney = By.id("com.wallet.crypto.trustapp:id/wallet_money");

    public boolean checkCreateNewWalletBtnIsDisplayed() {
        try {
            element(createANewWalletBtn).isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickOnCreateNewWalletBtn(){
        element(createANewWalletBtn).click();;
    }

    public void clickOnFirstConsentCheckBox(){
        element(firstConsent).click();
    }

    public void clickOnSecondConsentCheckBox(){
        element(secondtConsent).click();
    }

    public void clickOnThirdConsentCheckBox(){
        element(thirdConsent).click();
    }

    public void clickOnContinueBtn(){
        element(continueBtn).click();
    }

    public void clickOnCloseTray(){
        element(closeBtn).click();
    }

    public void enablePushNotificationBtnClick(){
        element(enablePNBtn).click();
    }

    public boolean checkWalletMoney() {
        try {
            element(walletMoney).isDisplayed();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
