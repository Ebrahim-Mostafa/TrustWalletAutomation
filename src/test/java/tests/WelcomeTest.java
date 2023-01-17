package tests;

import io.cucumber.java8.Th;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CreateNewWalletPage;
import pages.WelcomePage;
import setups.BaseDeviceTest;

public class WelcomeTest extends BaseDeviceTest{

    public WelcomePage wp;
    CreateNewWalletPage CNWP = new CreateNewWalletPage();
    public SoftAssert sa = new SoftAssert();

    @BeforeClass
    public void Initialization(){
        wp = new WelcomePage(driver);
        CNWP = new CreateNewWalletPage();
        sa = new SoftAssert();
    }

    @Test(priority = 1)
    public void checkForTrustWalletAppLogo() {
        sa.assertTrue(wp.CheckTrusWalletAppLogoIsDisplayed());
        sa.assertAll();
//        startAppium();
//        prepareAutomation();
    }
    @Test(priority = 2)
    public void checkForTrustWalletAppTitle() {
        sa.assertTrue(wp.CheckPrivateAndSecureTitleIsDisplayed());
        sa.assertAll();
//        startAppium();
//        prepareAutomation();
    }

    @Test(priority = 3)
    public void checkForPrivateAndSecureMessage() {
        sa.assertTrue(wp.checkPrivateAndSecureMessageIsDisplayed());
        sa.assertAll();
//        getDriverInstance().quit();
//        stopAppium();
    }

    @Test(priority = 4)
    public void checkForCreateNewWalletBtnIsDisplayed(){
        sa.assertTrue(wp.checkCreateNewWalletBtnIsDisplayed());
        sa.assertAll();
    }

    @Test(priority = 5)
    public void checkForAlreadyHaveWalletBtnIsDisplayed(){
        sa.assertEquals(wp.checkAlreadyHaveWalletBtnIsDisplayed(),true);
        sa.assertAll();
    }

    @Test(priority = 6)
    public void checkForalreadyHaveWalletBtnIsEnabled(){
        sa.assertEquals(wp.alreadyHaveWalletBtnIsEnabled(),true);
        sa.assertAll();
    }

    @Test(priority = 7)
    public void checkThatCreateNewWalletBtnIsDisplayed() {
        sa.assertEquals(CNWP.checkCreateNewWalletBtnIsDisplayed(),true);
        wp.clickOnCreateNewWalletBtn();
        sa.assertAll();
    }

//    @Test
//    public void clickONAlreadyHaveWalletBtn(){
//        wp.clickAlreadyHaveWalletBtn();
//    }
}
