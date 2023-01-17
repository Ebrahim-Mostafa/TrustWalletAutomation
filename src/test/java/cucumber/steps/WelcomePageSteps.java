package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.CreateNewWalletPage;
import pages.WelcomePage;
import setups.BaseDeviceTest;

public class WelcomePageSteps extends BaseDeviceTest {

    WelcomePage wp ;
    CreateNewWalletPage CNWP;
    public static SoftAssert sa;

    public WelcomePageSteps(){
        wp = new WelcomePage(driver);
        CNWP = new CreateNewWalletPage();
        sa = new SoftAssert();
    }

    @Given("^Trust wallet app is closed$")
    public void trust_wallet_app_is_closed() {
        System.out.println("======================== Ensure that AUT is closed before running the script ========================");
    }

    @When("^User is launching trust wallet app$")
    public void user_is_launching_trust_wallet_app() {
        System.out.println("======================== AUT is launching now !!! ========================");
    }
    //
    @Then("^Trust wallet App Logo Should be displayed$")
    public void trust_wallet_app_logo_should_be_displayed() {
        sa.assertTrue(wp.CheckTrusWalletAppLogoIsDisplayed());
        sa.assertAll();
    }

    @And("^Private and secure title is displayed$")
    public void private_and_secure_title_is_displayed() {
        sa.assertTrue(wp.CheckPrivateAndSecureTitleIsDisplayed());
        sa.assertAll();
    }

    @And("^Private and secure message is displayed$")
    public void private_and_secure_message_is_displayed() {
        sa.assertTrue(wp.checkPrivateAndSecureMessageIsDisplayed());
        sa.assertAll();
    }

    @When("^Create new wallet button is displayed$")
    public void create_new_wallet_button_is_displayed() {
        sa.assertTrue(wp.checkCreateNewWalletBtnIsDisplayed());
        sa.assertAll();
    }

    @And("^Already have a wallet button is displayed$")
    public void already_have_a_wallet_button_is_displayed() {
        sa.assertEquals(wp.checkAlreadyHaveWalletBtnIsDisplayed(),true);
        sa.assertAll();
    }

    @And("^Already have a wallet button is enabled$")
    public void already_have_a_wallet_button_is_enabled() {
        sa.assertEquals(wp.alreadyHaveWalletBtnIsEnabled(),true);
        sa.assertAll();
    }

    @Then("^Click on already have a wallet button$")
    public void click_on_already_have_a_wallet_button() {
        sa.assertEquals(CNWP.checkCreateNewWalletBtnIsDisplayed(),true);
        CNWP.clickOnCreateNewWalletBtn();
        sa.assertAll();
    }

}