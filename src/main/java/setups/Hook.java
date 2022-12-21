package setups;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends DriverSetup{
    @Before
    public void startAppium() throws Exception {
        startAppium();
        prepareAutomation();
    }

    @After
    public void stopeAppium() {
        getDriverInstance().quit();
        stopAppium();
    }
}