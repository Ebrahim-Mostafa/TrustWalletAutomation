package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.CreateNewWalletPage;
import pages.WelcomePage;

public class WelcomePageStep {

    public WelcomePage wp = new WelcomePage();
    CreateNewWalletPage CNWP = new CreateNewWalletPage();
    public SoftAssert sa = new SoftAssert();

    @Given("^User launch the aut$")
    public void userLaunchTheAut() {
        wp = new WelcomePage();
        CNWP = new CreateNewWalletPage();
        sa = new SoftAssert();
    }

    @Then("^checkForTrustWalletAppLogo$")
    public void checkForTrustWalletAppLogo(){
        sa.assertTrue(wp.CheckTrusWalletAppLogoIsDisplayed());
        sa.assertAll();
    }
}