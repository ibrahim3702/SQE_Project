package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page.LoginPage;
import factory.DriverFactory;

public class LoginSteps {
    private WebDriver driver = DriverFactory.getDriver("chrome");
    private LoginPage loginPage = new LoginPage(driver);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.navigate().to("http://example.com/login");
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        // Assertions to verify user is on dashboard
    }
}

