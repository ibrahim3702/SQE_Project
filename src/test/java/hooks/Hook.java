package hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.ScreenshotUtil;

public class Hook {

    private WebDriver driver;

    public Hook(DriverFactory driverFactory) {
        this.driver = driverFactory.getDriver("chrome");
    }

    @After
    public void afterEachTest(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtil.takeScreenshot(driver);
        }
        driver.quit();
    }
}

