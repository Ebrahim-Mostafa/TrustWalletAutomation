package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CreateNewWalletPage;
import pages.LegalPage;
import setups.BaseDeviceTest;

public class CreateNewWalletTest extends BaseDeviceTest {

    CreateNewWalletPage CNWP = new CreateNewWalletPage();
    LegalPage LP = new LegalPage();
    SoftAssert sa = new SoftAssert();

    @BeforeClass
    public void Initialization(){
        CNWP = new CreateNewWalletPage();
        LP = new LegalPage();
        sa = new SoftAssert();
    }

//    @Test
//    public void checkThatCreateNewWalletBtnIsDisplayed() throws InterruptedException {
//        Thread.sleep(5000);
//        sa.assertEquals(CNWP.checkCreateNewWalletBtnIsDisplayed(),true);
//        CNWP.clickOnCreateNewWalletBtn();
//        sa.assertAll();
//    }

//    @Test
//    public void acceptLegalAdviseOfTrustWalletApp(){
//        LP.clickOnConsentCheckBox();
//        LP.clickOnContinueBtn();
//    }

    @Test(priority = 18)
    public void walletBackupConsent() throws InterruptedException {
        Thread.sleep(20000);//passcode
        CNWP.clickOnFirstConsentCheckBox();
        CNWP.clickOnSecondConsentCheckBox();
        CNWP.clickOnThirdConsentCheckBox();
        CNWP.clickOnContinueBtn();
    }

    @Test(priority = 19)
    public void createWallet() throws InterruptedException {
        Thread.sleep(20000);//Passphrase
        CNWP.clickOnCloseTray();
        CNWP.enablePushNotificationBtnClick();
        sa.assertEquals(CNWP.checkWalletMoney(),true);
        CNWP.clickOnCreateNewWalletBtn();
        sa.assertAll();
    }
}
