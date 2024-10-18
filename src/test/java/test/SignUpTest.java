package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import page.SignUpPage;

public class SignUpTest {

    private WebDriver driver;
    private SignUpPage signUpPage;

    @BeforeEach
    public void setUp() {
       
        driver = DriverFactory.getDriver("chrome");

        driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
      
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void testSignUp() {
       
        signUpPage.enterFirstName("ali");
        signUpPage.enterLastName("waleed");
        signUpPage.enterUsername("waleed123");
        signUpPage.enterEmail("waleed@gmail.com");
        signUpPage.enterPassword("Password123");
        signUpPage.enterConfirmPassword("Password123");
        signUpPage.enterUserBio("This is a test user bio.");

       
        signUpPage.clickSubmit();

        
        Assertions.assertTrue(signUpPage.isSignUpSuccessful(), "Sign-up was not successful.");
    }

    @AfterEach
    public void tearDown() {
        
        if (driver != null) {
            driver.quit();
        }
    }
}
