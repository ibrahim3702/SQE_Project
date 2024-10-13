package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By checkoutButton = By.id("checkout-button");
    private By confirmationMessage = By.id("confirmation-message");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductInCart(String product) {
        // This method would ideally check if a product is displayed in the cart
        // This is a simplified example
        return driver.findElements(By.xpath("//td[contains(text(),'" + product + "')]")).size() > 0;
    }

    public void addProductToCart(String product, int quantity) {
        // Simulating adding a product to the cart
        // Actual implementation would depend on the web application
    }

    public void checkout() {
        driver.findElement(checkoutButton).click();
    }

    public void confirmPurchase() {
        // Simulating a confirmation action
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}