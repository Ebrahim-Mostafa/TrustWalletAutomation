package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LegalPage;
import setups.BaseDeviceTest;

public class LegalTest extends BaseDeviceTest {

    LegalPage LP = new LegalPage();
    SoftAssert sa = new SoftAssert();

    @BeforeClass
    public void Initialization(){
        LP = new LegalPage();
        sa = new SoftAssert();
    }

    @Test(priority = 8)
    public void verifyThatScreenTitleIsDisplayed() throws InterruptedException {
        Thread.sleep(10000);
        sa.assertTrue(LP.checkScreenTitleIsDisplayed());
        sa.assertAll();
    }

    @Test(priority = 9)
    public void verifyScreenTitleText(){
        sa.assertEquals(LP.checkScreenTitleText(),"Legal");
        sa.assertAll();
    }

    @Test(priority = 10)
    public void verifyThatPrivacyPolicyTileIsDisplayed(){
        sa.assertTrue(LP.checkPrivacyPolicytileIsDisplayed());
        sa.assertAll();
    }

    @Test(priority = 11)
    public void verifyPrivacyPolicyTileText(){
        sa.assertEquals(LP.checkprivacyPolicyTileText(),"Privacy Policy");
        sa.assertAll();
    }

    @Test(priority = 12)
    public void verifyThatTermsOfServiceIsDisplayed(){
        sa.assertTrue(LP.checktermsOfServiceIsDisplayed());
        sa.assertAll();
    }

    @Test(priority = 13)
    public void verifytermsOfServiceTileText(){
        sa.assertEquals(LP.checktermsOfServiceTileText(),"Terms of Service");
        sa.assertAll();
    }

    @Test(priority = 14)
    public void verifyThatCheckBoxConsentIsDisplayed(){
        sa.assertTrue(LP.CheckForcheckBoxConsentIsDisplayed());
        sa.assertAll();
    }

    @Test(priority = 15)
    public void verifyCheckBoxConsentText(){
        sa.assertEquals(LP.verifycheckBoxConsentText(),"I've read and accept the Terms of Service and Privacy Policy.");
        sa.assertAll();
    }

    @Test(priority = 16)
    public void verifyThatContinueBtnIsEnabled(){
        sa.assertEquals(LP.checkContinueBtnIsEnabled(),true);
        sa.assertAll();
    }

    @Test(priority = 17)
    public void acceptLegalAdviseOfTrustWalletApp(){
        LP.clickOnConsentCheckBox();
        LP.clickOnContinueBtn();
    }
}
