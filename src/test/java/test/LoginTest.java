package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import page.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver("chrome"); // can be parameterized
        driver.get("http://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.enterUsername("user");
        loginPage.enterPassword("password");
        loginPage.clickLogin();
        // Asserts to verify login success
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

