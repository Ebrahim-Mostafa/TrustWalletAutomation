package pages;

import org.openqa.selenium.By;
import setups.BaseDeviceTest;

public class LegalPage extends BaseDeviceTest {

    public By screenTitle = By.id("com.wallet.crypto.trustapp:id/title");
    public By privacyPolicy = By.id("com.wallet.crypto.trustapp:id/privacy");
    public By termsOfService = By.id("com.wallet.crypto.trustapp:id/terms");
    //I've read and accept the Terms of Service and Privacy Policy.
    public By checkBoxConsent = By.id("com.wallet.crypto.trustapp:id/acceptCheckBox");
    //CONTINUE
    public By continueBtn = By.id("com.wallet.crypto.trustapp:id/next");

    public boolean checkScreenTitleIsDisplayed(){
        try {
            element(screenTitle).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String checkScreenTitleText(){
        String title = element(screenTitle).getText();//Legal
        return title;
    }

    public boolean checkPrivacyPolicytileIsDisplayed(){
        try {
            element(privacyPolicy).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String checkprivacyPolicyTileText(){
        String title = element(privacyPolicy).getText(); //Privacy Policy
        return title;
    }

    public boolean checktermsOfServiceIsDisplayed(){
        try {
            element(termsOfService).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String checktermsOfServiceTileText(){
        String title = element(termsOfService).getText();//Terms of Service
        return title;
    }

    public boolean CheckForcheckBoxConsentIsDisplayed(){
        try {
            element(checkBoxConsent).isDisplayed();
            element(checkBoxConsent).isEnabled();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String verifycheckBoxConsentText(){
        String title = element(checkBoxConsent).getText();
        return title;
    }

    public boolean checkContinueBtnIsEnabled(){
        try {
            element(continueBtn).isEnabled();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnConsentCheckBox(){
        element(checkBoxConsent).click();
    }

    public void clickOnContinueBtn(){
        element(continueBtn).click();
    }
}
