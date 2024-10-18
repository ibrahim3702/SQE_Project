package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;

   
    private By firstNameInput = By.id("first_name");
    private By lastNameInput = By.id("last_name");
    private By usernameInput = By.id("user_login");
    private By emailInput = By.id("user_email");
    private By passwordInput = By.id("user_pass");
    private By confirmPasswordInput = By.id("user_confirm_password");
    private By userBioInput = By.id("description");
    private By submitButton = By.className("ur-submit-button");
    private By successMessage = By.className("ur-message");


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordInput).sendKeys(confirmPassword);
    }

    public void enterUserBio(String bio) {
        driver.findElement(userBioInput).sendKeys(bio);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isSignUpSuccessful() {
        
        String message = driver.findElement(successMessage).getText();
        return message.contains("User successfully registered.");
    }
}
